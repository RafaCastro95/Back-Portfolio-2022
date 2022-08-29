package com.portfolio.castrorafael.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDto {
    @NotBlank
    private String tituloExp;
    @NotBlank
    private int fechaExp;
    @NotBlank
    private String descExp;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String tituloExp, int fechaExp, String descExp) {
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }
}
