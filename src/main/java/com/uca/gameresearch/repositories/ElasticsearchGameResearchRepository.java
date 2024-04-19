package com.uca.gameresearch.repositories;

import com.uca.gameresearch.model.ModelGameResearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchGameResearchRepository extends ElasticsearchRepository<ModelGameResearch, Long>, InterfaceRepositories{
}
