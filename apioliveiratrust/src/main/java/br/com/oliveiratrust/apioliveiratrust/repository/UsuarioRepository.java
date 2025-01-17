package br.com.oliveiratrust.apioliveiratrust.repository;

import br.com.oliveiratrust.apioliveiratrust.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, Long> {
}
