package br.com.rest.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({ "br.com.rest.util", "br.com.rest.spring.mongo"})
@EnableMongoRepositories("br.com.rest.spring.mongo")
@Import({ MongoConfig.class })
public class AppConfig {

}
