package com.uca.gameresearch.services;

import com.uca.gameresearch.model.ModelGameResearch;

import java.util.List;
import java.util.Optional;

public interface InterfaceServices<T> {
    List<T> findAll();
    Optional<T> findById(String id);
    T save(T entity);
    void deleteById(String id);
    T update(T entity);
}
