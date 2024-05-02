package com.uca.gameresearch.repositories;

import com.uca.gameresearch.model.MongoModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Qualifier("mongoRepo")
public interface MongoGameResearchRepository extends MongoRepository<MongoModel, String>, InterfaceRepositories{
}
