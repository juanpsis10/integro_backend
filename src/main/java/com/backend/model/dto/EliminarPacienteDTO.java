package com.backend.model.dto;

public class EliminarPacienteDTO {
    private Integer idPaciente;

    public EliminarPacienteDTO() {
    }

    public EliminarPacienteDTO(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
