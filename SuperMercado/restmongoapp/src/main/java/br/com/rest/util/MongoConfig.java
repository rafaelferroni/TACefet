package br.com.rest.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;


@Configuration
public class MongoConfig {

	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {

//		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://professorhub-dev:p3t3c4d0@ds061777.mlab.com:61777/professorhub"));
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://gleisondb:dev:123@ds019634.mlab.com:19634/gleisondb"));

		SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongo, "gleisondb");
		return simpleMongoDbFactory;

	}
	
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		mongoTemplate.setWriteConcern(WriteConcern.SAFE);

		return mongoTemplate;

	}

}
