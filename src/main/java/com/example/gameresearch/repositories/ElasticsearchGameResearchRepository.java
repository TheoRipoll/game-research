package com.example.gameresearch.repositories;

import com.example.gameresearch.entity.EntityGameResearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ElasticsearchGameResearchRepository extends ElasticsearchRepository<EntityGameResearch, Long>{

}
