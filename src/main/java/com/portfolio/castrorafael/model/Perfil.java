package com.portfolio.castrorafael.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Perfil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;
    private String socialIg;
    private String socialTw;
    private String socialIn;
    private String socialGb;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu" )
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp" )
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro" )
    private List<Trabajo> trabajoList;

    public Perfil() {
    }


    public Perfil(Long id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil, String socialIg, String socialTw, String socialIn, String socialGb) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
        this.socialIg = socialIg;
        this.socialTw = socialTw;
        this.socialIn = socialIn;
        this.socialGb = socialGb;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getSocialIg() {
        return socialIg;
    }

    public void setSocialIg(String socialIg) {
        this.socialIg = socialIg;
    }

    public String getSocialTw() {
        return socialTw;
    }

    public void setSocialTw(String socialTw) {
        this.socialTw = socialTw;
    }

    public String getSocialIn() {
        return socialIn;
    }

    public void setSocialIn(String socialIn) {
        this.socialIn = socialIn;
    }

    public String getSocialGb() {
        return socialGb;
    }

    public void setSocialGb(String socialGb) {
        this.socialGb = socialGb;
    }
}
