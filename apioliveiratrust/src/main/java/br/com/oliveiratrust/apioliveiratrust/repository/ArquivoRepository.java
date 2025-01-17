package br.com.oliveiratrust.apioliveiratrust.repository;

import br.com.oliveiratrust.apioliveiratrust.entity.ArquivoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArquivoRepository extends MongoRepository<ArquivoEntity, Long> {
}
