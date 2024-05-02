package com.uca.gameresearch.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.annotations.Document;

@Qualifier("elasticModel")
@Document(indexName = "api-game-infos")
public class ElasticModel extends ModelGameResearch{
}
