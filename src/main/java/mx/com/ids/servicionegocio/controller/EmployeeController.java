package mx.com.ids.servicionegocio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.ids.servicionegocio.model.Employee;
import mx.com.ids.servicionegocio.service.EmployeeService;

@Controller
@RequestMapping("/views/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public ResponseEntity<?> getAll(){
		List<Employee> lista = service.getAll();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(null , HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(service.getAll());
	}
		
	@GetMapping("/detalle_employee/{id}")
	public ResponseEntity<Employee> getById(@PathVariable long id){
		Optional<Employee> emp = service.getById(id);
		return ResponseEntity.ok().body(emp.get());
	}
	
	@PostMapping("/newEmployee")
	public ResponseEntity<Employee> save(@RequestBody Employee emp){
		return ResponseEntity.ok().body(service.save(emp));
	}
	
	@DeleteMapping("/delete_employee/{id}")
	public HttpStatus delete(@PathVariable long id) {
		service.delete(id);
		return HttpStatus.OK;
	}
	
	
	
	///-----------------------------------------
	
	@GetMapping("/")
	public String getAll(Model model) {
		List<Employee> lista = service.getAll();
		model.addAttribute("titulo", "Lista de Employees");
		model.addAttribute("employee", lista);
		return "/views/employee/listar";
	}
}
