package com.uca.gameresearch.controllers;


import com.uca.gameresearch.model.ModelGameResearch;
import com.uca.gameresearch.services.ElasticsearchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/elasticsearch")
public class ElasticsearchController {

    @Autowired
    private final ElasticsearchServices elasticsearchServices;

    public ElasticsearchController(@Qualifier("elasticsearchServices") ElasticsearchServices elasticsearchServices) {
        this.elasticsearchServices = elasticsearchServices;
    }

    @PostMapping("/create")
    public ModelGameResearch create(@RequestBody ModelGameResearch modelGameResearch){
        return this.elasticsearchServices.save(modelGameResearch);
    }

    @PutMapping("/{id}")
    public ModelGameResearch update(@PathVariable Long id, @RequestBody ModelGameResearch modelGameResearch) {
        modelGameResearch.setId(id);
        return this.elasticsearchServices.update(modelGameResearch);
    }

    @GetMapping("/all")
    public Iterable<ModelGameResearch> findAll(){
        return this.elasticsearchServices.findAll();
    }

    @GetMapping("/{id}")
    public ModelGameResearch findById(@PathVariable Long id){
        return this.elasticsearchServices.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        this.elasticsearchServices.deleteById(id);
    }


}
