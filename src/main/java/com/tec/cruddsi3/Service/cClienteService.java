package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iClienteService;
import com.tec.cruddsi3.interfaces.iCliente;
import com.tec.cruddsi3.model.cCliente;

@Service
public class cClienteService implements iClienteService{
    @Autowired
    private iCliente data;
    
    @Override
    public List<cCliente> find(){
        return (List<cCliente>) data.findAll();
    }
    @Override
    public Optional<cCliente> findById(int id){
        return (Optional<cCliente>) data.findById(id);
    }
    @Override
    public int save(cCliente obj){
        int res=0;
    
        cCliente oCliente = data.save(obj);
        if (oCliente.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
}
