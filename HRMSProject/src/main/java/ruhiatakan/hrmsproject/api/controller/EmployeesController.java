package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruhiatakan.hrmsproject.business.abstracts.EmployeeService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.Employee;
import ruhiatakan.hrmsproject.entities.concretes.dtos.EmployeeForRegisterDto;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/register")
    public Result add(@RequestBody EmployeeForRegisterDto employee) {
        return this.employeeService.register(employee);
    }
}
