package ruhiatakan.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ruhiatakan.hrmsproject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee findByNationalityId(String nationalityId);
}
