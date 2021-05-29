package ruhiatakan.hrmsproject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruhiatakan.hrmsproject.business.abstracts.UserService;
import ruhiatakan.hrmsproject.core.utilities.helpers.EmailService;
import ruhiatakan.hrmsproject.core.utilities.results.*;
import ruhiatakan.hrmsproject.dataAccess.abstracts.UserDao;
import ruhiatakan.hrmsproject.entities.concretes.User;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    private EmailService emailService;
    @Autowired
    public UserManager(UserDao userDao,EmailService emailService) {
        super();
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>( userDao.findAll() );
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(userDao.findByEmail(email));
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        this.emailService.send(user.getEmail(),
                "Doğrulama Linki",
                "HRMS Sistemine hoşgeldiniz. "
                        + "Aşşağıdaki linke tıklayarak üyeliğinizi doğrulayabilirsiniz \n "
                        + "www.localhost:8080/api/users/verify?email=" + user.getEmail() + "&verifycode=" + user.getEmailVerifyCode());
        return new SuccessResult();
    }

    @Override
    public Result verifyUser(String email, String verificationCode) {
        User user = userDao.findByEmailAndEmailVerifyCode(email, verificationCode);
        if(user == null)
            return new ErrorResult("Doğrulama başarısız lütfen bilgileri doğru girdiğinizden emin olun.");

        user.setEmailVerified(true);
        userDao.save(user);
        return new SuccessResult("Kullanıcı e-postası başarıyla doğrulandı.");
    }
}
