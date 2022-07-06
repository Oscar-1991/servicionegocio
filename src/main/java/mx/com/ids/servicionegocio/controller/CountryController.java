package mx.com.ids.servicionegocio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.ids.servicionegocio.model.Country;
import mx.com.ids.servicionegocio.service.CountryService;

@Controller
@RequestMapping("/apiv1/contries")
public class CountryController {
	@Autowired
	private CountryService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		List<Country> lista = service.getAll();
		if(lista.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(service.getAll());
	}
	
	@GetMapping("/detalle/{id}")
	public ResponseEntity<Country> getById(@PathVariable long id){
		Optional<Country> coun = service.getById(id);
		return ResponseEntity.ok().body(coun.get());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Country> save(@RequestBody Country cou){
		return ResponseEntity.ok().body(service.save(cou));
	}
	
	@DeleteMapping("/delete/{id}")
	public HttpStatus delete(@PathVariable long id) {
		service.delete(id);
		return HttpStatus.OK;
	}
	
}
