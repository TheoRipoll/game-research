package com.example.gameresearch.services;

import com.example.gameresearch.entity.EntityGameResearch;
import com.example.gameresearch.repositories.MongoGameResearchRepository;

import java.io.Serializable;
import java.util.List;

public class MongoServices implements InterfaceServices{

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
    public void update(EntityGameResearch entity) {

    }
}
