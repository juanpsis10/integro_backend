package com.backend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tc_ubigeo", schema = "admision")
public class UbigeoDistrito {
    @Id
    @Column(name = "codigo_distrito")
    private String codigoDistrito;

    @Column(name = "descripcion_distrito")
    private String descripcionDistrito;

    @Column(name = "fl_estado")
    private boolean estado;

    @Column(name = "codigo_provincia") // Campo necesario para filtrar por provincia
    private String codigoProvincia;

    // Constructor vacío
    public UbigeoDistrito() {
    }

    // Constructor con todos los atributos
    public UbigeoDistrito(String codigoDistrito, String descripcionDistrito, boolean estado, String codigoProvincia) {
        this.codigoDistrito = codigoDistrito;
        this.descripcionDistrito = descripcionDistrito;
        this.estado = estado;
        this.codigoProvincia = codigoProvincia;
    }

    // Métodos getters y setters
    public String getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(String codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public String getDescripcionDistrito() {
        return descripcionDistrito;
    }

    public void setDescripcionDistrito(String descripcionDistrito) {
        this.descripcionDistrito = descripcionDistrito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
}
