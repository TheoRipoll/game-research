package com.uca.gameresearch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.gameresearch.repositories",
        "com.example.gameresearch.services",
        "com.example.gameresearch.entity",
        "com.example.gameresearch.controllers"})
public class RepositoryConfig {
}
