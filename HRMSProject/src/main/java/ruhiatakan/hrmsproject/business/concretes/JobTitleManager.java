package ruhiatakan.hrmsproject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import ruhiatakan.hrmsproject.business.abstracts.JobTitleService;
import ruhiatakan.hrmsproject.dataAccess.abstracts.JobTitleDao;
import ruhiatakan.hrmsproject.entities.concretes.JobTitle;

import java.util.List;

public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        super();
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }
}
