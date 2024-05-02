package com.uca.gameresearch.services;

import com.uca.gameresearch.model.MongoModel;
import com.uca.gameresearch.repositories.MongoGameResearchRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Qualifier("mongoService")
@Service
public class MongoServices implements InterfaceServices<MongoModel>{

    private final MongoGameResearchRepository mongoGameResearchRepository;

    public MongoServices(@Qualifier("mongoRepo") MongoGameResearchRepository mongoGameResearchRepository) {
        this.mongoGameResearchRepository = mongoGameResearchRepository;
    }

    @Override
    public List<MongoModel> findAll() {
        return mongoGameResearchRepository.findAll();
    }

    @Override
    public Optional<MongoModel> findById(String id) {
        return null;
    }

    @Override
    public MongoModel save(MongoModel entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public MongoModel update(MongoModel entity) {
        return null;
    }
}
