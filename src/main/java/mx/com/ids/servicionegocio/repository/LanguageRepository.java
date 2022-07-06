package mx.com.ids.servicionegocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.ids.servicionegocio.model.Languages;

@Repository
public interface LanguageRepository extends JpaRepository<Languages, Long>{

}
