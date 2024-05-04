package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cPlatos;

public interface iPlatosService {
    public List<cPlatos> find();
    public Optional<cPlatos> findById(int id);
    public int save(cPlatos obj);
    public void delete(int id);
}
