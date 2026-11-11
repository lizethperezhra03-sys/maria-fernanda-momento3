package com.reserva.libros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Revista")
public class Revista {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

   @Column(name="hojas", length=100, nullable=false)
    String hojas;
 @Column(name="dibujos", length=100, nullable=false)
    String dibujos;
 @Column(name="papel", length=100, nullable=false)
    String papel;
 @Column(name="secciones", length=100, nullable=false)
    String secciones;

    

    public Revista() {
    }
    public Revista(int id, String hojas, String dibujos, String papel, String secciones) {
        this.id = id;
        this.hojas = hojas;
        this.dibujos = dibujos;
        this.papel = papel;
        this.secciones = secciones;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHojas() {
        return hojas;
    }
    public void setHojas(String hojas) {
        this.hojas = hojas;
    }
    public String getDibujos() {
        return dibujos;
    }
    public void setDibujos(String dibujos) {
        this.dibujos = dibujos;
    }
    public String getPapel() {
        return papel;
    }
    public void setPapel(String papel) {
        this.papel = papel;
    }
    public String getSecciones() {
        return secciones;
    }
    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }
}
