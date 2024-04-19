package com.uca.gameresearch.repositories;

import com.uca.gameresearch.entity.EntityGameResearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchGameResearchRepository extends ElasticsearchRepository<EntityGameResearch, Long>{

}
