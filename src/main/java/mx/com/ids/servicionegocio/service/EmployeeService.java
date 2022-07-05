package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import mx.com.ids.servicionegocio.model.Employee;

public interface EmployeeService {
	 Optional<Employee> getById(Long id);
	 
	 List<Employee> getAll();
	 
	 void delete(Long id);
	
	 Employee save(Employee e);
}
