package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ModelGameResearch;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
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
    public List<ModelGameResearch> findAll() {
        Iterable<ModelGameResearch> gameResearches = elasticsearchGameResearchRepository.findAll();
        return (List<ModelGameResearch>) gameResearches;
    }

    @Override
    public ModelGameResearch findById(Serializable id) {
        return null;
    }

    @Override
    public ModelGameResearch save(ModelGameResearch entity) {
        return this.elasticsearchGameResearchRepository.save(entity);
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public ModelGameResearch update(ModelGameResearch entity) {
        return this.elasticsearchGameResearchRepository.save(entity);
    }
}
