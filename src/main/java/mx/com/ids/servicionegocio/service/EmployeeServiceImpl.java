package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ids.servicionegocio.model.Employee;
import mx.com.ids.servicionegocio.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employee;


	@Override
	public Optional<Employee> getById(Long id) {
		// TODO Auto-generated method stub
		return employee.findById(id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		employee.deleteById(id);
		
	}

	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		return employee.save(e); 
	}
	
	
}
