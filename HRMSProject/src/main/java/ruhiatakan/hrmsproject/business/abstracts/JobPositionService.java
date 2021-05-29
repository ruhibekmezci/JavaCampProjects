package ruhiatakan.hrmsproject.business.abstracts;

import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
    JobPosition getByPositionName(String positionName);
    DataResult<JobPosition> getById(int id);
    Result addNew(JobPosition jobPosition);
}
