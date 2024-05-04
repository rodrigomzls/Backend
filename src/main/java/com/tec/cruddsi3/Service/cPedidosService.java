package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iPedidosService;
import com.tec.cruddsi3.interfaces.iPedidos;
import com.tec.cruddsi3.model.cPedidos;


@Service
public class cPedidosService implements iPedidosService {
    @Autowired
    private iPedidos data;
    
    @Override
    public List<cPedidos> find(){
        return (List<cPedidos>) data.findAll();
    }
    @Override
    public Optional<cPedidos> findById(int id){
        return (Optional<cPedidos>) data.findById(id);
    }
    @Override
    public int save(cPedidos obj){
        int res=0;
        
        cPedidos oPedido = data.save(obj);
        if (oPedido.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
}
