package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ModelGameResearch;

import java.util.List;
import java.util.Optional;

public interface InterfaceServices<T extends ModelGameResearch>{

    List<T> findAll();

    Optional<T> findById(String id);

    T save(T entity);

    void deleteById(String id);

    void deleteAll();

    void delete(T entity);

    T update(T entity);
}
