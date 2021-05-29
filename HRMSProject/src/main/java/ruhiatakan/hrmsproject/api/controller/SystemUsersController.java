package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruhiatakan.hrmsproject.business.abstracts.SystemUserService;
import ruhiatakan.hrmsproject.entities.concretes.SystemUser;

import java.util.List;

@RestController
@RequestMapping("/api/systemusers")
public class SystemUsersController {
    private SystemUserService systemUserService;

    @Autowired
    public SystemUsersController(SystemUserService systemUserService) {
        super();
        this.systemUserService = systemUserService;
    }


    @GetMapping("/getall")
    public List<SystemUser> getAll(){
        return systemUserService.getAll();
    }

}
