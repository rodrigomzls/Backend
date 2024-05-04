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

import com.tec.cruddsi3.interfaceService.iClienteService;
import com.tec.cruddsi3.model.cCliente;

@RestController
@RequestMapping(path = "/api/v1/cliente")
public class cClienteController {
    @Autowired
    private iClienteService service;

    @GetMapping
    public List<cCliente> find(){
        return service.find();
    }

    @GetMapping("/{id}")
    public Optional<cCliente> findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody cCliente oCliente){
        return service.save(oCliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }
}
