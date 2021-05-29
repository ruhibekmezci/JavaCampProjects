package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    JobPosition findByPositionName(String positionName);
    JobPosition findById(int id);
}
