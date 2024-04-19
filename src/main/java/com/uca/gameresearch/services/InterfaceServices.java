package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ModelGameResearch;

import java.io.Serializable;
import java.util.List;

public interface InterfaceServices {
    List<ModelGameResearch> findAll();
    ModelGameResearch findById(Serializable id);
    ModelGameResearch save(ModelGameResearch entity);
    void deleteById(Serializable id);
    ModelGameResearch update(ModelGameResearch entity);
}
