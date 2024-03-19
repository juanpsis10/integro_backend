package com.backend.model.dto;

public class UbigeoDepartamentoDTO {
    private String codigoDepartamento;
    private String descripcionDepartamento;
    private boolean estado;

    // Constructor vacío
    public UbigeoDepartamentoDTO() {
    }

    // Constructor con parámetros
    public UbigeoDepartamentoDTO(String codigoDepartamento, String descripcionDepartamento, boolean estado) {
        this.codigoDepartamento = codigoDepartamento;
        this.descripcionDepartamento = descripcionDepartamento;
        this.estado = estado;
    }

    // Getters y setters
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getDescripcionDepartamento() {
        return descripcionDepartamento;
    }

    public void setDescripcionDepartamento(String descripcionDepartamento) {
        this.descripcionDepartamento = descripcionDepartamento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
