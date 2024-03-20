package com.backend.model.dto;

import java.util.Date;

public class EditarPacienteDTO {
    private Integer idPaciente;
    private String codigoUbigeo;
    private String apellidoMaterno;
    private Integer idSexo;
    private String direccion;
    private String lugarNacimiento;
    private String asegurado;
    private String numeroDocumentoIdentidad;
    private Integer idTipoDocumentoIdentidad;
    private Date fechaNacimiento;
    private String nombres;
    private String apellidoPaterno;

    
    public EditarPacienteDTO() {
    }

    public EditarPacienteDTO(Integer idPaciente, String codigoUbigeo, String apellidoMaterno, Integer idSexo, String direccion, String lugarNacimiento, String asegurado,
                          String numeroDocumentoIdentidad, Integer idTipoDocumentoIdentidad, Date fechaNacimiento,
                          String nombres, String apellidoPaterno) {
        this.idPaciente = idPaciente;
        this.codigoUbigeo = codigoUbigeo;
        this.apellidoMaterno = apellidoMaterno;
        this.idSexo = idSexo;
        this.direccion = direccion;
        this.lugarNacimiento = lugarNacimiento;
        this.asegurado = asegurado;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
    }

    
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public Integer getIdTipoDocumentoIdentidad() {
        return idTipoDocumentoIdentidad;
    }

    public void setIdTipoDocumentoIdentidad(Integer idTipoDocumentoIdentidad) {
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
}
