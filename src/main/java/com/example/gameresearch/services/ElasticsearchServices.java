package com.example.gameresearch.services;

import com.example.gameresearch.entity.EntityGameResearch;
import com.example.gameresearch.repositories.ElasticsearchGameResearchRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class ElasticsearchServices implements InterfaceServices{
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
        return null;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(EntityGameResearch entity) {

    }
}
