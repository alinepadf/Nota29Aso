package br.com.alineferreira.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.alineferreira.model.Nota;

@Repository
public interface NotaRepository extends MongoRepository<Nota, String>{
	
	List<Nota> findByTitulo(String titulo);

}
