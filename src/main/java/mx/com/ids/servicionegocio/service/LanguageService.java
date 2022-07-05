package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import mx.com.ids.servicionegocio.model.Language;

public interface LanguageService {
    Optional<Language> getById(Long id);

    List<Language> getAll();

    void delete(Long id);

    Language save(Language l);
}
