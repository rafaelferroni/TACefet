package br.com.rest.spring.mongo;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import br.com.rest.util.SpringUtil;

import com.mongodb.WriteResult;

@Component
public class EnderecoRepositoryCustomImpl implements EnderecoRepositoryCustom {

	private MongoTemplate mongoTemplate;
	
	@Override
	public void findAndUpdate(Criteria cb, String campo, String valor) {
		
		mongoTemplate = (MongoTemplate) SpringUtil.getContext().getBean("mongoTemplate");
		
		Query query = new Query();
		query.addCriteria(cb);
		Update  update = new Update();
		update.set(campo, valor);
		WriteResult rua = mongoTemplate.updateMulti(query, update, Endereco.class);
		
	}
	

}
