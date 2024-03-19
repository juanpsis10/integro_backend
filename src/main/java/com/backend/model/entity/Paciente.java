package com.backend.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_paciente", schema = "admision")
public class Paciente {
    @Id
    @Column(name = "id_paciente")
    private Integer idPaciente;

    @Column(name = "id_tipo_docide")
    private Integer idTipoDocide;

    @Column(name = "no_docide")
    private String noDocide;

    @Column(name = "no_apepat")
    private String noApepat;

    @Column(name = "no_apemat")
    private String noApemat;

    @Column(name = "no_nombres")
    private String noNombres;

    @Column(name = "fl_estado")
    private Boolean flEstado;

    @Column(name = "fe_nacimiento")
    private LocalDate feNacimiento;

    @Column(name = "co_asegurado")
    private String coAsegurado;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con todos los atributos
    public Paciente(Integer idPaciente, Integer idTipoDocide, String noDocide, String noApepat, String noApemat, String noNombres, Boolean flEstado, LocalDate feNacimiento, String coAsegurado) {
        this.idPaciente = idPaciente;
        this.idTipoDocide = idTipoDocide;
        this.noDocide = noDocide;
        this.noApepat = noApepat;
        this.noApemat = noApemat;
        this.noNombres = noNombres;
        this.flEstado = flEstado;
        this.feNacimiento = feNacimiento;
        this.coAsegurado = coAsegurado;
    }

    // Métodos getters y setters
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdTipoDocide() {
        return idTipoDocide;
    }

    public void setIdTipoDocide(Integer idTipoDocide) {
        this.idTipoDocide = idTipoDocide;
    }

    public String getNoDocide() {
        return noDocide;
    }

    public void setNoDocide(String noDocide) {
        this.noDocide = noDocide;
    }

    public String getNoApepat() {
        return noApepat;
    }

    public void setNoApepat(String noApepat) {
        this.noApepat = noApepat;
    }

    public String getNoApemat() {
        return noApemat;
    }

    public void setNoApemat(String noApemat) {
        this.noApemat = noApemat;
    }

    public String getNoNombres() {
        return noNombres;
    }

    public void setNoNombres(String noNombres) {
        this.noNombres = noNombres;
    }

    public Boolean getFlEstado() {
        return flEstado;
    }

    public void setFlEstado(Boolean flEstado) {
        this.flEstado = flEstado;
    }

    public LocalDate getFeNacimiento() {
        return feNacimiento;
    }

    public void setFeNacimiento(LocalDate feNacimiento) {
        this.feNacimiento = feNacimiento;
    }

    public String getCoAsegurado() {
        return coAsegurado;
    }

    public void setCoAsegurado(String coAsegurado) {
        this.coAsegurado = coAsegurado;
    }
}
