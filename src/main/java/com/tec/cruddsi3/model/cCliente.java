package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class cCliente {

    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRES", length = 50)
    private String nombres;

    @Column(name = "APELLIDOS", length = 50)
    private String apellidos;

    @Column(name = "NÚMERO", length = 9)
    private String numero;

    @Column(name = "DIRECCIÓN", length = 200)
    private String direccion;

    @Column(name = "CORREO", length = 200)
    private String correo;


    // CONSTRUCTORES
    public cCliente() {
    }


    public cCliente(int id, String nombres, String apellidos, String numero, String direccion, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero = numero;
        this.direccion = direccion;
        this.correo = correo;
    }


    public cCliente(String nombres, String apellidos, String numero, String direccion, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero = numero;
        this.direccion = direccion;
        this.correo = correo;
    }


     //gets & sets
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }   
}