package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Qualifier("elasticService")
@Service
public class ElasticsearchServices implements InterfaceServices<ElasticModel>{

    private static final String INDEX = "api-game-infos";

    private final ElasticsearchGameResearchRepository elasticsearchGameResearchRepository;

    public ElasticsearchServices(@Qualifier("elasticRepo") ElasticsearchGameResearchRepository elasticsearchGameResearchRepository) {
        this.elasticsearchGameResearchRepository = elasticsearchGameResearchRepository;
    }

    public ElasticsearchServices() {
        this.elasticsearchGameResearchRepository = null;
    }

    @Override
    public List<ElasticModel> findAll() {
        Iterable<ElasticModel> gameResearches = elasticsearchGameResearchRepository.findAll();
        return (List<ElasticModel>) gameResearches;
    }

    @Override
    public Optional<ElasticModel> findById(String id) {
        return this.elasticsearchGameResearchRepository.findById(id);
    }

    @Override
    public ElasticModel save(ElasticModel entity) {
        try {
            assert this.elasticsearchGameResearchRepository != null;
            return this.elasticsearchGameResearchRepository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        this.elasticsearchGameResearchRepository.deleteById(id);
    }

    public void deleteAll() {
        this.elasticsearchGameResearchRepository.deleteAll();
    }

    public void delete(ElasticModel entity) {
        this.elasticsearchGameResearchRepository.delete(entity);
    }

    @Override
    public ElasticModel update(ElasticModel entity) {
        return this.elasticsearchGameResearchRepository.save(entity);
    }
}
