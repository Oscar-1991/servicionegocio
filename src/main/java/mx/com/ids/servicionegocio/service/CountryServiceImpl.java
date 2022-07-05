package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ids.servicionegocio.model.Country;
import mx.com.ids.servicionegocio.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepository country;

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        country.deleteById(id);
        
    }

    @Override
    public List<Country> getAll() {
        // TODO Auto-generated method stub
        return country.findAll();
    }

    @Override
    public Optional<Country> getById(Long id) {
        // TODO Auto-generated method stub
        return country.findById(id);
    }

    @Override
    public Country save(Country c) {
        // TODO Auto-generated method stub
        return country.save(c);
    }

    
}
