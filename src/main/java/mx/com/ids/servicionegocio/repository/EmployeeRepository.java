package mx.com.ids.servicionegocio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.ids.servicionegocio.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
