package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ids.servicionegocio.model.Language;
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
    public List<Language> getAll() {
        // TODO Auto-generated method stub
        return language.findAll();
    }

    @Override
    public Optional<Language> getById(Long id) {
        // TODO Auto-generated method stub
        return language.findById(id);
    }

    @Override
    public Language save(Language l) {
        // TODO Auto-generated method stub
        return language.save(l);
    }

    
    
}
