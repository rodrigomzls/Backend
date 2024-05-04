package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class cPedidos {
    
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PED")
    private int id;
    
    @Column(name = "DESCRIPCIÓN", length = 500)
   private String descripcion;

    @Column(name = "PLATOS")
    private String platos;

    
    //CONSTRUCTORES
    public cPedidos() {
    }

    public cPedidos(int id, String descripcion, String platos) {
        this.id = id;
        this.descripcion = descripcion;
        this.platos = platos;
    }

    public cPedidos(String descripcion, String platos) {
        this.descripcion = descripcion;
        this.platos = platos;
    }


    //gets & sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlatos() {
        return platos;
    }

    public void setPlatos(String platos) {
        this.platos = platos;
    }
   
}
