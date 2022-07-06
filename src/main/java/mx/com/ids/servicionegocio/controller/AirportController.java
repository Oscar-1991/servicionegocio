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

import mx.com.ids.servicionegocio.model.Airport;
import mx.com.ids.servicionegocio.service.AirportService;

@Controller
@RequestMapping("/apiv1/airports")
public class AirportController {
	@Autowired
	private AirportService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		List<Airport> lista = service.getAll();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(null , HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(service.getAll());
	}
		
	@GetMapping("/detalle/{id}")
	public ResponseEntity<Airport> getById(@PathVariable long id){
		Optional<Airport> air = service.getById(id);
		return ResponseEntity.ok().body(air.get());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Airport> save(@RequestBody Airport air){
		return ResponseEntity.ok().body(service.save(air));
	}
	
	@DeleteMapping("/delete/{id}")
	public HttpStatus delete(@PathVariable long id) {
		service.delete(id);
		return HttpStatus.OK;
	}
}
