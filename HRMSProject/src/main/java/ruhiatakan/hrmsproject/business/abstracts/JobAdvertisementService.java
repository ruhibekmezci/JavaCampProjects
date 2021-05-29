package ruhiatakan.hrmsproject.business.abstracts;

import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.JobAdvertisement;
import ruhiatakan.hrmsproject.entities.concretes.dtos.JobAdvertisementForAddDto;

import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> findByIsActiveTrue();
    DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate();
    DataResult<List<JobAdvertisement>> findByEmployer_EmployerId(int employerId);
    Result addNew(JobAdvertisementForAddDto jobAdvertisement);
    Result changeStatus(int advertisementId, int employerId);
}
