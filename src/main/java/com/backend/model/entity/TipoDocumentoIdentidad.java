package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "tc_tipo_documento_identidad", schema = "admision")
public class TipoDocumentoIdentidad {
    @Id
    @Column(name = "id_tipo_documento_identidad")
    private Integer id;

    @Column(name = "fl_estado")
    private Boolean estado;

    @Column(name = "descripcion_tipo_documento_identidad")
    private String descripcion;

    @Column(name = "codigo_ieds")
    private String codigo;

    public TipoDocumentoIdentidad() {
        // Constructor vacío necesario para JPA
    }

    public TipoDocumentoIdentidad(Integer id, Boolean estado, String descripcion, String codigo) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    // Getters y setters

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
