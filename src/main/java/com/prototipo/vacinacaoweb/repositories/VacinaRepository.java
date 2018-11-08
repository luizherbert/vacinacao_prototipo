/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototipo.vacinacaoweb.repositories;

import com.prototipo.vacinacaoweb.models.Vacina;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author didin
 */
public interface VacinaRepository extends CrudRepository<Vacina, String> {
    @Override
    Optional<Vacina> findById(String id);
    
    @Override
    void delete(Vacina deleted);
}