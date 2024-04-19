package com.uca.gameresearch.repositories;

import com.uca.gameresearch.model.ModelGameResearch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoGameResearchRepository extends MongoRepository<ModelGameResearch, Long>, InterfaceRepositories{

}
