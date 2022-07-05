package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import mx.com.ids.servicionegocio.model.Airport;

public interface AirportService {
	Optional<Airport> getById(Long id);

	List<Airport> getAll();

	void delete(Long id);

	Airport save(Airport a);
}
