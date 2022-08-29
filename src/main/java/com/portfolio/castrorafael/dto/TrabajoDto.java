package com.portfolio.castrorafael.dto;

import javax.validation.constraints.NotBlank;

public class TrabajoDto {
    @NotBlank
    private String nombrePro;
    @NotBlank
    private String descPro;
    @NotBlank
    private String imagenPro;

    public TrabajoDto() {
    }

    public TrabajoDto(String nombrePro, String descPro, String imagenPro) {
        this.nombrePro = nombrePro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
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
