package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer> {
}
