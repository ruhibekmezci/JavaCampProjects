package ruhiatakan.hrmsproject.business.abstracts;

import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.Employer;
import ruhiatakan.hrmsproject.entities.concretes.dtos.EmployerForRegisterDto;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    DataResult<Employer> getById(int id);
    Result register(EmployerForRegisterDto employer);
}
