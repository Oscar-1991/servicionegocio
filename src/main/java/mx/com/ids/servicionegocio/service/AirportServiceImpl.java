package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ids.servicionegocio.model.Airport;
import mx.com.ids.servicionegocio.repository.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService{
    @Autowired
    private AirportRepository airport;

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        airport.deleteById(id);
        
    }

    @Override
    public List<Airport> getAll() {
        // TODO Auto-generated method stub
        return airport.findAll();
    }

    @Override
    public Optional<Airport> getById(Long id) {
        // TODO Auto-generated method stub
        return airport.findById(id);
    }

    @Override
    public Airport save(Airport a) {
        // TODO Auto-generated method stub
        return airport.save(a);
    }

    
    
}
