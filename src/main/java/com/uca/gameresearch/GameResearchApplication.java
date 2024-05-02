package com.uca.gameresearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = com.uca.gameresearch.repositories.MongoGameResearchRepository.class)
@EnableElasticsearchRepositories(basePackageClasses = com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository.class)
@SpringBootApplication
public class GameResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameResearchApplication.class, args);
	}
}
