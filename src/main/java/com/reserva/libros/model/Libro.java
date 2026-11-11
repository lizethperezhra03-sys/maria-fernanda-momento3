 package com.reserva.libros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Libros")

public class Libro {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(name="portada", length=100, nullable=false)
    String portada;
   
    @Column(name="hojas", length=700, nullable=false)
    String hojas;
   
    @Column(name="autor", length=100,nullable=false)
    String autor;
   
    @Column(name="edicion", length=50,nullable=false)
    String edicion;
    

    
    public Libro() {
    }
    public Libro(int id, String portada, String hojas, String autor, String edicion) {
        this.id = id;
        this.portada = portada;
        this.hojas = hojas;
        this.autor = autor;
        this.edicion = edicion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPortada() {
        return portada;
    }
    public void setPortada(String portada) {
        this.portada = portada;
    }
    public String getHojas() {
        return hojas;
    }
    public void setHojas(String hojas) {
        this.hojas = hojas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    } 
    
}
