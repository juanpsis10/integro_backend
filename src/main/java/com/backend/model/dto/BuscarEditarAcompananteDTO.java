package com.backend.model.dto;

import java.util.Date;

public class BuscarEditarAcompananteDTO {
    private Integer idPacienteAcompanante;
    private String codigoUbigeo;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private Integer idTipoDocumentoIdentidad;
    private String nombres;
    private Integer idParentesco;
    private String numeroDocumentoIdentidad;
    private Integer idPaciente;
    private String direccion;
    private String telefonoContacto;
    private String apellidoPaterno;


    public BuscarEditarAcompananteDTO() {
    }
    
    public BuscarEditarAcompananteDTO(Integer idPacienteAcompanante, String codigoUbigeo, String apellidoMaterno, Date fechaNacimiento, Integer idTipoDocumentoIdentidad, String nombres, Integer idParentesco, String numeroDocumentoIdentidad, Integer idPaciente, String direccion, String telefonoContacto, String apellidoPaterno) {
        this.idPacienteAcompanante = idPacienteAcompanante;
        this.codigoUbigeo = codigoUbigeo;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
        this.nombres = nombres;
        this.idParentesco = idParentesco;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.idPaciente = idPaciente;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.apellidoPaterno = apellidoPaterno;
    }

    
    public Integer getIdPacienteAcompanante() {
        return idPacienteAcompanante;
    }

    public void setIdPacienteAcompanante(Integer idPacienteAcompanante) {
        this.idPacienteAcompanante = idPacienteAcompanante;
    }

    public String getCodigoUbigeo() {
        return codigoUbigeo;
    }

    public void setCodigoUbigeo(String codigoUbigeo) {
        this.codigoUbigeo = codigoUbigeo;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdTipoDocumentoIdentidad() {
        return idTipoDocumentoIdentidad;
    }

    public void setIdTipoDocumentoIdentidad(Integer idTipoDocumentoIdentidad) {
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
}
