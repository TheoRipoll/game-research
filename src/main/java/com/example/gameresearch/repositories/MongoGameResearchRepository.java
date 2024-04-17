package com.example.gameresearch.repositories;

import com.example.gameresearch.entity.EntityGameResearch;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

public interface MongoGameResearchRepository extends MongoRepository<EntityGameResearch, Long>{

}
