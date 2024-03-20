package com.backend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_paciente_acompanante")
public class EliminarAcompanante {
    
    @Id
    @Column(name = "id_paciente")
    private Integer idPaciente;

    
    public EliminarAcompanante() {
    }

    
    public EliminarAcompanante(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
