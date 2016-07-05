package br.com.rest.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
	
//	List<Produto> findByNome(String nome);
	
	 @Query("{ 'nome' : ?0 }")
	 List<Produto> findByNome(String texto);
	 

}
