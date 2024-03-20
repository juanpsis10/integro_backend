package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "tc_parentesco")
public class Parentesco {
    @Id
    @Column(name = "id_parentesco")
    private Integer id;

    @Column(name = "il_activo")
    private Boolean activo;

    @Column(name = "no_parentesco")
    private String parentesco;

    public Parentesco() {
        
    }

    public Parentesco(Integer id, Boolean activo, String parentesco) {
        this.id = id;
        this.activo = activo;
        this.parentesco = parentesco;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
