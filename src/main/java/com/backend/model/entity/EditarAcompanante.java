package com.backend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_paciente_acompanante")
public class EditarAcompanante {
    @Id
    @Column(name = "id_paciente_acompanante")
    private Integer idPacienteAcompanante;

    @Column(name = "co_ubigeo")
    private String codigoUbigeo;

    @Column(name = "no_apemat")
    private String apellidoMaterno;

    @Column(name = "fe_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "id_tipo_docide")
    private Integer idTipoDocumentoIdentidad;

    @Column(name = "no_nombres")
    private String nombres;

    @Column(name = "id_parentesco")
    private Integer idParentesco;

    @Column(name = "no_docide")
    private String numeroDocumentoIdentidad;

    @Column(name = "no_direccion")
    private String direccion;

    @Column(name = "nu_telefo_contacto")
    private String telefonoContacto;

    @Column(name = "no_apepat")
    private String apellidoPaterno;

    @Column(name = "id_paciente") 
    private Integer idPaciente;

    

    public EditarAcompanante() {
    }

    public EditarAcompanante(Integer idPacienteAcompanante, String codigoUbigeo, String apellidoMaterno, Date fechaNacimiento, Integer idTipoDocumentoIdentidad, String nombres, Integer idParentesco, String numeroDocumentoIdentidad, String direccion, String telefonoContacto, String apellidoPaterno, Integer idPaciente) {
        this.idPacienteAcompanante = idPacienteAcompanante;
        this.codigoUbigeo = codigoUbigeo;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
        this.nombres = nombres;
        this.idParentesco = idParentesco;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.apellidoPaterno = apellidoPaterno;
        this.idPaciente = idPaciente; 
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

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
