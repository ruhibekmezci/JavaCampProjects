package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruhiatakan.hrmsproject.business.abstracts.UserService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.User;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;


    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }



    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

    @PostMapping("/verify")
    public Result verify(String email, String verifyCode) {
        return userService.verifyUser(email, verifyCode);
    }

}
