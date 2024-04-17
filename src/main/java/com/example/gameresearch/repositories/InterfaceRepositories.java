package com.example.gameresearch.repositories;

import com.example.gameresearch.entity.EntityGameResearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface InterfaceRepositories{
    List<EntityGameResearch> findAll();
    EntityGameResearch findById(Serializable id);
    EntityGameResearch save(EntityGameResearch entity);
    void deleteById(Serializable id);
    void update(EntityGameResearch entity);

}
