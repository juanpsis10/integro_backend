package com.backend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tc_ubigeo", schema = "admision")
public class UbigeoProvincia {
    @Id
    @Column(name = "codigo_provincia")
    private String codigoProvincia;

    @Column(name = "descripcion_provincia")
    private String descripcionProvincia;

    @Column(name = "fl_estado")
    private boolean estado;

    @Column(name = "codigo_departamento") // Nuevo campo
    private String codigoDepartamento;

    // Constructor vacío
    public UbigeoProvincia() {
    }

    // Constructor con todos los atributos
    public UbigeoProvincia(String codigoProvincia, String descripcionProvincia, boolean estado, String codigoDepartamento) {
        this.codigoProvincia = codigoProvincia;
        this.descripcionProvincia = descripcionProvincia;
        this.estado = estado;
        this.codigoDepartamento = codigoDepartamento; // Asignación del nuevo campo
    }

    // Métodos getters y setters
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

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
}
