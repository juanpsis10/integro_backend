package com.backend.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_paciente_acompanante")
public class RegistrarAcompanante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente_acompanante")
    private Integer idPacienteAcompanante;

    @Column(name = "id_paciente")
    private Integer idPaciente;

    @Column(name = "id_tipo_docide")
    private Integer idTipoDocumento;

    @Column(name = "no_docide")
    private String numeroDocumento;

    @Column(name = "no_apepat")
    private String apellidoPaterno;

    @Column(name = "no_apemat")
    private String apellidoMaterno;

    @Column(name = "no_nombres")
    private String nombres;

    @Column(name = "fe_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "no_direccion")
    private String direccion;

    @Column(name = "co_ubigeo")
    private String codigoUbigeo;

    @Column(name = "id_parentesco")
    private Integer idParentesco;

    @Column(name = "nu_telefo_contacto")
    private String telefonoContacto;

    public RegistrarAcompanante() {
    }

    public RegistrarAcompanante(Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno, String apellidoMaterno, String nombres, Date fechaNacimiento, String direccion, String codigoUbigeo, Integer idParentesco, String telefonoContacto) {
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.codigoUbigeo = codigoUbigeo;
        this.idParentesco = idParentesco;
        this.telefonoContacto = telefonoContacto;
    }

    public Integer getIdPacienteAcompanante() {
        return idPacienteAcompanante;
    }

    public void setIdPacienteAcompanante(Integer idPacienteAcompanante) {
        this.idPacienteAcompanante = idPacienteAcompanante;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoUbigeo() {
        return codigoUbigeo;
    }

    public void setCodigoUbigeo(String codigoUbigeo) {
        this.codigoUbigeo = codigoUbigeo;
    }

    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}
