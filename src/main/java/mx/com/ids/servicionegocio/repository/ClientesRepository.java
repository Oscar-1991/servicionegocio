package mx.com.ids.servicionegocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.ids.servicionegocio.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
