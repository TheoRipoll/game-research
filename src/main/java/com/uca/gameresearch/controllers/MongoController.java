package com.uca.gameresearch.controllers;

import com.uca.gameresearch.model.MongoModel;
import com.uca.gameresearch.services.InterfaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mongo")
public class MongoController {

    private final InterfaceServices<MongoModel> interfaceServices;

    @Autowired
    public MongoController(InterfaceServices<MongoModel> interfaceServices) {
        this.interfaceServices = interfaceServices;
    }

    @PostMapping("/create")
    public ResponseEntity<MongoModel> create(@RequestBody MongoModel modelGameResearch){
        try {
            MongoModel modelGameResearch1 = this.interfaceServices.save(modelGameResearch);
            return new ResponseEntity<>(modelGameResearch1, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<MongoModel> findById(@PathVariable String id) {
        return this.interfaceServices.findById(id).map(modelGameResearch ->
                new ResponseEntity<>(modelGameResearch, HttpStatus.OK)).orElseGet(() ->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<MongoModel>> findAll() {
        try {
            List<MongoModel> modelGameResearches = this.interfaceServices.findAll();
            return new ResponseEntity<>(modelGameResearches, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}