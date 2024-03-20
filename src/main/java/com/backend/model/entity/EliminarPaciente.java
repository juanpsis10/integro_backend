package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class EliminarPaciente {
    @Id
    @Column(name = "id_paciente")
    private Integer idPaciente;

    
    public EliminarPaciente() {
    }

    
    public EliminarPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
