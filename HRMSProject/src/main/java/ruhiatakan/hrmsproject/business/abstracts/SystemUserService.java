package ruhiatakan.hrmsproject.business.abstracts;

import ruhiatakan.hrmsproject.entities.concretes.SystemUser;

import java.util.List;

public interface SystemUserService {
    List<SystemUser> getAll();
}
