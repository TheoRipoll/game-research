package com.uca.gameresearch.services;

import com.uca.gameresearch.entity.EntityGameResearch;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public abstract class ElasticsearchServices implements InterfaceServices{
    private final ElasticsearchGameResearchRepository elasticsearchGameResearchRepository;
    public ElasticsearchServices(ElasticsearchGameResearchRepository elasticsearchGameResearchRepository) {
    this.elasticsearchGameResearchRepository = elasticsearchGameResearchRepository;
    }
    @Override
    public List<EntityGameResearch> findAll() {
        Iterable<EntityGameResearch> gameResearches = elasticsearchGameResearchRepository.findAll();
        return (List<EntityGameResearch>) gameResearches;
    }

    @Override
    public EntityGameResearch findById(Serializable id) {
        return null;
    }

    @Override
    public EntityGameResearch save(EntityGameResearch entity) {
        return this.elasticsearchGameResearchRepository.save(entity);
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public EntityGameResearch update(EntityGameResearch entity) {
        return null;
    }
}
