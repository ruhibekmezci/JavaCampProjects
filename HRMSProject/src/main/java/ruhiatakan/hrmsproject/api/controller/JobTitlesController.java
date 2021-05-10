package ruhiatakan.hrmsproject.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ruhiatakan.hrmsproject.business.abstracts.JobTitleService;
import ruhiatakan.hrmsproject.entities.concretes.JobTitle;

import java.util.List;

@RestController
@RequestMapping("api/job-titles/")
public class JobTitlesController {
    private final JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService){
        super();
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }
}
