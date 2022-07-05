package mx.com.ids.servicionegocio.service;

import java.util.Optional;

import mx.com.ids.servicionegocio.model.Airport;

public interface AirportService {
	Optional<Airport> getById(Long id);
}
