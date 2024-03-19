package com.backend.model.dto;

public class UbigeoProvinciaDTO {
    private String codigoProvincia;
    private String descripcionProvincia;
    private boolean estado;

    public UbigeoProvinciaDTO(String codigoProvincia, String descripcionProvincia, boolean estado) {
        this.codigoProvincia = codigoProvincia;
        this.descripcionProvincia = descripcionProvincia;
        this.estado = estado;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    public void setDescripcionProvincia(String descripcionProvincia) {
        this.descripcionProvincia = descripcionProvincia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
