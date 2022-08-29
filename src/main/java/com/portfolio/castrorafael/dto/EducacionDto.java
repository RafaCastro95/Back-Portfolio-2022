package com.portfolio.castrorafael.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDto {
    @NotBlank
    private String tituloEdu;
    @NotBlank
    private int fechaEdu;
    @NotBlank
    private String descEdu;
    @NotBlank
    private String imagenEdu;

    public EducacionDto() {
    }

    public EducacionDto(String tituloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
}
