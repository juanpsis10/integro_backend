package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "tc_sexo")
public class Sexo {
    @Id
    @Column(name = "id_sexo")
    private Integer id;

    @Column(name = "fl_estado")
    private Boolean estado;

    @Column(name = "descripcion_sexo")
    private String descripcion;

    public Sexo() {
        
    }

    public Sexo(Integer id, Boolean estado, String descripcion) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
