package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import mx.com.ids.servicionegocio.model.Country;

public interface CountryService {
    Optional<Country> getById(Long id);

    List<Country> getAll();

    void delete(Long id);

    Country save(Country c);
    
}
