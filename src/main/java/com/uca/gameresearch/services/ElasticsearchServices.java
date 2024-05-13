package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.model.ModelGameResearch;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
import com.uca.gameresearch.repositories.InterfaceRepositories;
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

    @Autowired
    public ElasticsearchServices(ElasticsearchGameResearchRepository elasticsearchGameResearchRepository) {
        this.elasticsearchGameResearchRepository = elasticsearchGameResearchRepository;
    }

    public List<ElasticModel> findAll() {
        return (List<ElasticModel>) this.elasticsearchGameResearchRepository.findAll();
    }

    public Optional<ElasticModel> findById(String id) {
        return this.elasticsearchGameResearchRepository.findById(id);
    }

    public ElasticModel save(ElasticModel entity) {
        try {
            assert this.elasticsearchGameResearchRepository != null;
            return this.elasticsearchGameResearchRepository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteById(String id) {
        this.elasticsearchGameResearchRepository.deleteById(id);
    }

    public void deleteAll() {
        this.elasticsearchGameResearchRepository.deleteAll();
    }


}
