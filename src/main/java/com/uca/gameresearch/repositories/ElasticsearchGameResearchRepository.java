package com.uca.gameresearch.repositories;

import com.uca.gameresearch.model.ElasticModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Qualifier("elasticRepo")
public interface ElasticsearchGameResearchRepository extends ElasticsearchRepository<ElasticModel, String>, InterfaceRepositories{
}
