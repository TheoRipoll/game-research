package com.uca.gameresearch.controllers;

import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.model.ModelGameResearch;
import com.uca.gameresearch.services.InterfaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/elastic")
public class ElasticsearchController {

    private final InterfaceServices<ElasticModel> interfaceServices;

    @Autowired
    public ElasticsearchController(InterfaceServices<ElasticModel> interfaceServices) {
        this.interfaceServices = interfaceServices;
    }

    @PostMapping("/create")
    public ResponseEntity<ModelGameResearch> create(@RequestBody ElasticModel modelGameResearch){
        try {
            ElasticModel modelGameResearch1 = this.interfaceServices.save(modelGameResearch);
            return new ResponseEntity<>(modelGameResearch1, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ElasticModel> findById(@PathVariable String id) {
        Optional<ElasticModel>  optionalInfos = this.interfaceServices.findById(id);
        return optionalInfos.map(modelGameResearch ->
                new ResponseEntity<>(modelGameResearch, HttpStatus.OK)).orElseGet(() ->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<ElasticModel>> findAll() {
        try {
            List<ElasticModel> modelGameResearches = this.interfaceServices.findAll();
            return new ResponseEntity<>(modelGameResearches, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ElasticModel> update(@PathVariable String id, @RequestBody ElasticModel modelGameResearch) {
        Optional<ElasticModel> optionalInfo = this.interfaceServices.findById(id);
        try {
            if (optionalInfo.isPresent()) {
                modelGameResearch.setId(id);
                return new ResponseEntity<>(this.interfaceServices.update(modelGameResearch), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        Optional<ElasticModel> optionalInfo = this.interfaceServices.findById(id);
        try {
            if (optionalInfo.isPresent()) {
                this.interfaceServices.deleteById(id);
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAll() {
        try {
            this.interfaceServices.deleteAll();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
