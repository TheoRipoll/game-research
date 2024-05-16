package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.repositories.ElasticsearchGameResearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Qualifier("elasticService")
@Service
public class ElasticsearchServices implements InterfaceServices<ElasticModel>{

    private final ElasticsearchGameResearchRepository elasticsearchGameResearchRepository;

    @Autowired
    public ElasticsearchServices(ElasticsearchGameResearchRepository elasticsearchGameResearchRepository) {
        this.elasticsearchGameResearchRepository = elasticsearchGameResearchRepository;
    }

    public List<ElasticModel> findAll() {
        try {
            assert this.elasticsearchGameResearchRepository != null;
            Page<ElasticModel> page = (Page<ElasticModel>) this.elasticsearchGameResearchRepository.findAll();
            return page.getContent();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
        try {
            this.elasticsearchGameResearchRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAll() {
        try {
            this.elasticsearchGameResearchRepository.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ElasticModel update(ElasticModel entity) {
        try {
            return this.elasticsearchGameResearchRepository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
