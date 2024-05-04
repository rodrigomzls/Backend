package com.tec.cruddsi3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.cruddsi3.interfaceService.iPlatosService;
import com.tec.cruddsi3.model.cPlatos;

@RestController
@RequestMapping(path = "/api/v1/plato")
public class cPlatosController {
    @Autowired
    private iPlatosService service;

    @GetMapping
    public List<cPlatos> find(){
        return service.find();
    }

    @GetMapping("/{id}")
    public Optional<cPlatos> findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody cPlatos oPlato){
        return service.save(oPlato);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }
}
