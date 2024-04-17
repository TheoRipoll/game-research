package com.example.gameresearch;

import com.example.gameresearch.entity.EntityGameResearch;
import com.example.gameresearch.repositories.InterfaceRepositories;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class GameResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameResearchApplication.class, args);
	}
}
