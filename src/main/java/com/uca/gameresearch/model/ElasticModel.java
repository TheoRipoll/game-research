package com.uca.gameresearch.model;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.annotations.Document;

@Builder
@Qualifier("elasticModel")
@Document(indexName = "api-game-infos")
public class ElasticModel extends ModelGameResearch{
}
