package ruhiatakan.hrmsproject.business.abstracts;

import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.Employee;
import ruhiatakan.hrmsproject.entities.concretes.dtos.EmployeeForRegisterDto;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
    Result register(EmployeeForRegisterDto employee);
}
