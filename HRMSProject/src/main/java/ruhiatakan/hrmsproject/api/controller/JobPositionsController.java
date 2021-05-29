package ruhiatakan.hrmsproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ruhiatakan.hrmsproject.business.abstracts.JobPositionService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.entities.concretes.JobPosition;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }


    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }

    @GetMapping("/getbyname")
    public JobPosition getByPositionName(String positionName){
        return this.jobPositionService.getByPositionName(positionName);
    }
    @GetMapping("/getbyid")
    public DataResult<JobPosition> getById(int id){
        return this.jobPositionService.getById(id);
    }
    @PostMapping("add")
    public Result addNew(@RequestBody JobPosition jobPosition) {
        return this.jobPositionService.addNew(jobPosition);
    }
}
