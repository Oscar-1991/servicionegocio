package mx.com.ids.servicionegocio.service;

import java.util.List;
import java.util.Optional;

import mx.com.ids.servicionegocio.model.Languages;

public interface LanguageService {
    Optional<Languages> getById(Long id);

    List<Languages> getAll();

    void delete(Long id);

    Languages save(Languages l);
}
