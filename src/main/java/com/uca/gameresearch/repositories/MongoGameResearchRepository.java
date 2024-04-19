package com.uca.gameresearch.repositories;

import com.uca.gameresearch.entity.EntityGameResearch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoGameResearchRepository extends MongoRepository<EntityGameResearch, Long>{

}
