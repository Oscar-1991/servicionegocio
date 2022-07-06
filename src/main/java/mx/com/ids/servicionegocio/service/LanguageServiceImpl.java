package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ids.servicionegocio.model.Languages;
import mx.com.ids.servicionegocio.repository.LanguageRepository;

@Service
public class LanguageServiceImpl implements LanguageService{
    @Autowired
    private LanguageRepository language;

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        language.deleteById(id);
        
    }

    @Override
    public List<Languages> getAll() {
        // TODO Auto-generated method stub
        return language.findAll();
    }

    @Override
    public Optional<Languages> getById(Long id) {
        // TODO Auto-generated method stub
        return language.findById(id);
    }

    @Override
    public Languages save(Languages l) {
        // TODO Auto-generated method stub
        return language.save(l);
    }

    
    
}
