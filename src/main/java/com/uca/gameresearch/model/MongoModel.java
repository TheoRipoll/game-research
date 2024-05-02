package com.uca.gameresearch.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.mapping.Document;

@Qualifier("mongoModel")
@Document(collection = "api-game-infos")
public class MongoModel extends ModelGameResearch{

}
