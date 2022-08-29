package com.portfolio.castrorafael.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPro;
    private String nombrePro;
    private String descPro;
    private String imagenPro;


    public Trabajo() {
    }

    public Trabajo(String nombrePro, String descPro, String imagenPro) {
        this.nombrePro = nombrePro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }
}
