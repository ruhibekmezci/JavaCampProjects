package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruhiatakan.hrmsproject.business.abstracts.EmployerService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.Employer;
import ruhiatakan.hrmsproject.entities.concretes.dtos.EmployerForRegisterDto;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/register")
    public Result add(@RequestBody EmployerForRegisterDto employer) {
        return this.employerService.register(employer);
    }
}
