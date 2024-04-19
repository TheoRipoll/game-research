package com.uca.gameresearch.controllers;


import com.uca.gameresearch.entity.EntityGameResearch;
import com.uca.gameresearch.services.ElasticsearchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/elasticsearch")
public class ElasticsearchController {

    @Autowired
    private ElasticsearchServices elasticsearchServices;

    @PostMapping("/create")
    public EntityGameResearch create(@RequestBody EntityGameResearch entityGameResearch){
        return this.elasticsearchServices.save(entityGameResearch);
    }

    @PutMapping("/{id}")
    public EntityGameResearch update(@PathVariable Long id,@RequestBody EntityGameResearch entityGameResearch) {
        entityGameResearch.setId(id);
        return this.elasticsearchServices.save(entityGameResearch);
    }
}
