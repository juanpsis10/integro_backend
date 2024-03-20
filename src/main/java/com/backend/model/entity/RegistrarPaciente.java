package com.backend.model.entity;

import javax.persistence.*;
import java.util.Date; 


@Entity
@Table(name = "tb_paciente")
public class RegistrarPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "id_sexo")
    private Integer idSexo;

    @Column(name = "fe_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "no_lugar_nacimiento")
    private String lugarNacimiento;

    @Column(name = "no_direccion")
    private String direccion;

    @Column(name = "co_ubigeo")
    private String codigoUbigeo;

    @Column(name = "fl_estado")
    private Integer estado;

    @Column(name = "co_asegurado")
    private String codigoAsegurado;

    public RegistrarPaciente() {
    }

    public RegistrarPaciente(Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno, String apellidoMaterno, String nombres, Integer idSexo, Date fechaNacimiento, String lugarNacimiento, String direccion, String codigoUbigeo, Integer estado, String codigoAsegurado) {
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.idSexo = idSexo;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.direccion = direccion;
        this.codigoUbigeo = codigoUbigeo;
        this.estado = estado;
        this.codigoAsegurado = codigoAsegurado;
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

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getCodigoAsegurado() {
        return codigoAsegurado;
    }

    public void setCodigoAsegurado(String codigoAsegurado) {
        this.codigoAsegurado = codigoAsegurado;
    }
}
