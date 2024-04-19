package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ModelGameResearch;
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
    public List<ModelGameResearch> findAll() {
        return mongoGameResearchRepository.findAll();
    }

    @Override
    public ModelGameResearch findById(Serializable id) {
        return null;
    }

    @Override
    public ModelGameResearch save(ModelGameResearch entity) {
        return null;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public ModelGameResearch update(ModelGameResearch entity) {
        return null;
    }
}
