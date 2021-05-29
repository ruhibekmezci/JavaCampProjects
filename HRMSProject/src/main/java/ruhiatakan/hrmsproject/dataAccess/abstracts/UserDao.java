package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByEmailAndEmailVerifyCode(String email, String emailVerifyCode);
}
