package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
