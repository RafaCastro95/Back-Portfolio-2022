package com.portfolio.castrorafael.dto;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class SkillDto {

    @NotBlank
    private String nombreSkill;


    @Min(0)
    private int porcentaje;


    @NotBlank
    private String imagenSkill;

    public SkillDto() {
    }

    public SkillDto( String nombreSkill, int porcentaje, String imagenSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
        this.imagenSkill = imagenSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImagenSkill() {
        return imagenSkill;
    }

    public void setImagenSkill(String imagenSkill) {
        this.imagenSkill = imagenSkill;
    }
}
