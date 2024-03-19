package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tc_ubigeo", schema = "admision")
public class UbigeoDepartamento {
    @Id
    @Column(name = "codigo_departamento")
    private String codigoDepartamento;

    @Column(name = "descripcion_departamento")
    private String descripcionDepartamento;

    @Column(name = "fl_estado")
    private boolean estado;

    // Constructor
    public UbigeoDepartamento() {
        // Constructor vacío necesario para JPA
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
