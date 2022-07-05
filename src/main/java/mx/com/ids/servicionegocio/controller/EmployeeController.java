package mx.com.ids.servicionegocio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.ids.servicionegocio.model.Employee;
import mx.com.ids.servicionegocio.service.EmployeeService;

@Controller
@RequestMapping("/views/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/")
	public String Employees(Model model) {
		List<Employee> lista = employeeservice.getAll();
		model.addAttribute("titulo", "Lista de Employees");
		model.addAttribute("employees", lista);
		return "/views/employee/listar";
	}
		
	
}
