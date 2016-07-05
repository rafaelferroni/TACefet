package br.com.herbertrausch.spring.mongo;

import org.springframework.data.mongodb.core.query.Criteria;


public interface UsuarioRepositoryCustom {
	
	void findAndUpdate(Criteria cb,String campo, String valor);

}
