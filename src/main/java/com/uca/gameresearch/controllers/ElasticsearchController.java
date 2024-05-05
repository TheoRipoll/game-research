package com.uca.gameresearch.controllers;


import com.uca.gameresearch.model.ElasticModel;
import com.uca.gameresearch.model.ModelGameResearch;
import com.uca.gameresearch.services.ElasticsearchServices;
import com.uca.gameresearch.services.InterfaceServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/game-infos")
public class ElasticsearchController {

    private final InterfaceServices<ElasticModel> interfaceServices;

    @Autowired
    public ElasticsearchController(@Qualifier("elasticService") InterfaceServices<ElasticModel> interfaceServices) {
        this.interfaceServices = interfaceServices;
    }

    @PostMapping("/create")
    public ResponseEntity<ModelGameResearch> create(@RequestBody ElasticModel modelGameResearch){
        ModelGameResearch modelGameResearch1 = this.interfaceServices.save(modelGameResearch);
        return new ResponseEntity<>(modelGameResearch1, HttpStatus.CREATED);
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
        Iterable<ElasticModel> infos = this.interfaceServices.findAll();
        List<ElasticModel> infosList = new ArrayList<>();
        infos.forEach(infosList::add);
        return new ResponseEntity<>(infosList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ElasticModel> update(@PathVariable String id, @RequestBody ElasticModel modelGameResearch) {
        Optional<ElasticModel> optionalInfo = this.interfaceServices.findById(id);

        if (optionalInfo.isPresent()) {
            modelGameResearch.setId(id);
            this.interfaceServices.save(modelGameResearch);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        Optional<ElasticModel> optionalInfo = this.interfaceServices.findById(id);

        if (optionalInfo.isPresent()) {
            this.interfaceServices.deleteById(optionalInfo.get().getId());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
