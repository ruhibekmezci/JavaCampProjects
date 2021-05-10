package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
