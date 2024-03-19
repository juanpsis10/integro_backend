package com.backend.model.dto;

import java.time.LocalDate;

public class PacienteDTO {
    private String noApepat;
    private String noApemat;
    private String noNombres;
    private String noDocide;
    private Boolean flEstado;
    private LocalDate feNacimiento;
    private String coAsegurado;
    private String descripcionTipoDocide;

    public PacienteDTO(String noApepat, String noApemat, String noNombres, String noDocide, Boolean flEstado, LocalDate feNacimiento, String coAsegurado, String descripcionTipoDocide) {
        this.noApepat = noApepat;
        this.noApemat = noApemat;
        this.noNombres = noNombres;
        this.noDocide = noDocide;
        this.flEstado = flEstado;
        this.feNacimiento = feNacimiento;
        this.coAsegurado = coAsegurado;
        this.descripcionTipoDocide = descripcionTipoDocide;
    }

    public String getNoApepat() {
        return noApepat;
    }

    public void setNoApepat(String noApepat) {
        this.noApepat = noApepat;
    }

    public String getNoApemat() {
        return noApemat;
    }

    public void setNoApemat(String noApemat) {
        this.noApemat = noApemat;
    }

    public String getNoNombres() {
        return noNombres;
    }

    public void setNoNombres(String noNombres) {
        this.noNombres = noNombres;
    }

    public String getNoDocide() {
        return noDocide;
    }

    public void setNoDocide(String noDocide) {
        this.noDocide = noDocide;
    }

    public Boolean getFlEstado() {
        return flEstado;
    }

    public void setFlEstado(Boolean flEstado) {
        this.flEstado = flEstado;
    }

    public LocalDate getFeNacimiento() {
        return feNacimiento;
    }

    public void setFeNacimiento(LocalDate feNacimiento) {
        this.feNacimiento = feNacimiento;
    }

    public String getCoAsegurado() {
        return coAsegurado;
    }

    public void setCoAsegurado(String coAsegurado) {
        this.coAsegurado = coAsegurado;
    }

    public String getDescripcionTipoDocide() {
        return descripcionTipoDocide;
    }

    public void setDescripcionTipoDocide(String descripcionTipoDocide) {
        this.descripcionTipoDocide = descripcionTipoDocide;
    }
}
