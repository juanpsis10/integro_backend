package com.backend.model.dto;

public class EliminarAcompananteDTO {
    private Integer idPaciente;

    public EliminarAcompananteDTO() {
    }

    public EliminarAcompananteDTO(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
