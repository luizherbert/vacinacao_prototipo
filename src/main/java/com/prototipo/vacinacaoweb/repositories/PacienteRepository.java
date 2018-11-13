package com.prototipo.vacinacaoweb.repositories;

import com.prototipo.vacinacaoweb.models.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author didin
 */
public interface PacienteRepository extends CrudRepository<Paciente, String> {
    @Override
    Optional<Paciente> findById(String id);
    
    @Override
    void delete(Paciente deleted);
}