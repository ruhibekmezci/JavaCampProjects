package ruhiatakan.hrmsproject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruhiatakan.hrmsproject.business.abstracts.SystemUserService;
import ruhiatakan.hrmsproject.dataAccess.abstracts.SystemUserDao;
import ruhiatakan.hrmsproject.entities.concretes.SystemUser;

import java.util.List;

@Service
public class SystemUserManager implements SystemUserService {
    private SystemUserDao systemUserDao;
    @Autowired
    public SystemUserManager(SystemUserDao systemUserDao) {
        super();
        this.systemUserDao = systemUserDao;
    }

    @Override
    public List<SystemUser> getAll() {
        return this.systemUserDao.findAll();
    }
}
