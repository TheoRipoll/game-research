package com.uca.gameresearch.repositories;

import com.uca.gameresearch.entity.EntityGameResearch;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface InterfaceRepositories extends ElasticsearchGameResearchRepository, MongoGameResearchRepository{
    List<EntityGameResearch> findAll();
    EntityGameResearch findById(Serializable id);
    EntityGameResearch save(EntityGameResearch entity);
    void deleteById(Serializable id);
    EntityGameResearch update(EntityGameResearch entity);
}
