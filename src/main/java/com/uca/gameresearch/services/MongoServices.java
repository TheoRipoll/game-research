package com.uca.gameresearch.services;

import com.uca.gameresearch.entity.EntityGameResearch;
import com.uca.gameresearch.repositories.MongoGameResearchRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class MongoServices implements InterfaceServices{

    private final MongoGameResearchRepository mongoGameResearchRepository;
    public MongoServices(MongoGameResearchRepository mongoGameResearchRepository, MongoGameResearchRepository mongoGameResearchRepository1) {
        this.mongoGameResearchRepository = mongoGameResearchRepository1;
    }
    @Override
    public List<EntityGameResearch> findAll() {
        return mongoGameResearchRepository.findAll();
    }

    @Override
    public EntityGameResearch findById(Serializable id) {
        return null;
    }

    @Override
    public EntityGameResearch save(EntityGameResearch entity) {
        return null;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public EntityGameResearch update(EntityGameResearch entity) {
        return null;
    }
}
