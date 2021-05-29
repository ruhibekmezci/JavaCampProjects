package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruhiatakan.hrmsproject.business.abstracts.JobAdvertisementService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.JobAdvertisement;
import ruhiatakan.hrmsproject.entities.concretes.dtos.JobAdvertisementForAddDto;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        super();
        this.jobAdvertisementService = jobAdvertisementService;
    }


    @GetMapping("/getAllActive")
    public DataResult<List<JobAdvertisement>> getAllActive(){
        return this.jobAdvertisementService.findByIsActiveTrue();
    }
    @GetMapping("/getAllActiveOrderByDate")
    public DataResult<List<JobAdvertisement>> getAllActiveOrderDate(){
        return this.jobAdvertisementService.findByIsActiveTrueOrderByCreateDate();
    }
    @GetMapping("/getAllActiveByEmployer")
    public DataResult<List<JobAdvertisement>> getAllActiveOrderDate(int employerId){
        return this.jobAdvertisementService.findByEmployer_EmployerId(employerId);
    }
    @PutMapping("/changestatus")
    public Result changeStatus(int jobadvertisementId, int employerId){
        return this.jobAdvertisementService.changeStatus(jobadvertisementId, employerId);
    }
    @PostMapping("/add")
    public Result addNew(@RequestBody JobAdvertisementForAddDto jobAdvertisement){
        return this.jobAdvertisementService.addNew(jobAdvertisement);
    }
}
