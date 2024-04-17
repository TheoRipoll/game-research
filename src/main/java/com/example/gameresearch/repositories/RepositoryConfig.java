package com.example.gameresearch.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan(basePackages = {"com.example.gameresearch.repositories",
        "com.example.gameresearch.services",
        "com.example.gameresearch.entity",
        "com.example.gameresearch.controllers"})
public class RepositoryConfig {
}
