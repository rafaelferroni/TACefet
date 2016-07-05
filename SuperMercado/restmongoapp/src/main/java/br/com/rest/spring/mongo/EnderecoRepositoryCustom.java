package br.com.rest.spring.mongo;

import org.springframework.data.mongodb.core.query.Criteria;


public interface EnderecoRepositoryCustom {
	
	void findAndUpdate(Criteria cb,String campo, String valor);

}
