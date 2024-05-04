package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iPlatosService;
import com.tec.cruddsi3.interfaces.iPlatos;
import com.tec.cruddsi3.model.cPlatos;

@Service
public class cPlatosService implements iPlatosService {
    @Autowired
    private iPlatos data;
    
    @Override
    public List<cPlatos> find(){
        return (List<cPlatos>) data.findAll();
    }
    @Override
    public Optional<cPlatos> findById(int id){
        return (Optional<cPlatos>) data.findById(id);
    }
    @Override
    public int save(cPlatos obj){
        int res=0;
       
        cPlatos oPlato = data.save(obj);
        if (oPlato.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
}
