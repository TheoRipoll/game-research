package com.uca.gameresearch;

import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
import com.uca.gameresearch.repositories.MongoGameResearchRepository;
import com.uca.gameresearch.services.InterfaceServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = com.uca.gameresearch.repositories.MongoGameResearchRepository.class)
@EnableElasticsearchRepositories(basePackageClasses = com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository.class)
@SpringBootApplication
public class GameResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameResearchApplication.class, args);
	}

	@Bean
	CommandLineRunner start(@Qualifier("elasticsearchServices") InterfaceServices<ElasticModel> elasticsearchGameResearchRepository){
		return args -> {
				ElasticModel elasticModel = ElasticModel.builder()
						.id("1")
						.name("Elasticsearch")
						.build();
			}
		});
}
