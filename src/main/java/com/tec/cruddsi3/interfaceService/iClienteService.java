package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cCliente;

public interface iClienteService {
    public List<cCliente> find();
    public Optional<cCliente> findById(int id);
    public int save(cCliente obj);
    public void delete(int id);
}