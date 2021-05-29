package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> findByIsActiveTrue();
    List<JobAdvertisement> findByIsActiveTrueOrderByCreateDate();
    List<JobAdvertisement> findByIsActiveTrueAndEmployer_UserId(int userId);
    JobAdvertisement findByIdAndEmployer_UserId(int id, int userId);
}
