package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cPedidos;

public interface iPedidosService {
    public List<cPedidos> find();
    public Optional<cPedidos> findById(int id);
    public int save(cPedidos obj);
    public void delete(int id);
}
