package com.uca.gameresearch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.uca.gameresearch.repositories",
        "com.uca.gameresearch.services",
        "com.uca.gameresearch.model",
        "com.uca.gameresearch.controllers"})
public class RepositoryConfig {
}
