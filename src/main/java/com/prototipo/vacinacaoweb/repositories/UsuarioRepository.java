package com.prototipo.vacinacaoweb.repositories;

import com.prototipo.vacinacaoweb.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByUsuario(String nomeUsuario);
}
