package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrarAcompananteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void registrarAcompanante(Integer idPaciente, Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno,
            String apellidoMaterno, String nombres, Date fechaNacimiento,
            String direccion, String codigoUbigeo, Integer idParentesco, String telefonoContacto) {

        String query = "INSERT INTO tb_paciente_acompanante (id_paciente, id_tipo_docide, no_docide, no_apepat, no_apemat, no_nombres, "
                + "fe_nacimiento, no_direccion, co_ubigeo, id_parentesco, nu_telefo_contacto) "
                + "VALUES (:idPaciente, :idTipoDocumento, :numeroDocumento, :apellidoPaterno, :apellidoMaterno, :nombres, "
                + ":fechaNacimiento, :direccion, :codigoUbigeo, :idParentesco, :telefonoContacto)";

        entityManager.createNativeQuery(query)
                .setParameter("idPaciente", idPaciente)
                .setParameter("idTipoDocumento", idTipoDocumento)
                .setParameter("numeroDocumento", numeroDocumento)
                .setParameter("apellidoPaterno", apellidoPaterno)
                .setParameter("apellidoMaterno", apellidoMaterno)
                .setParameter("nombres", nombres)
                .setParameter("fechaNacimiento", fechaNacimiento)
                .setParameter("direccion", direccion)
                .setParameter("codigoUbigeo", codigoUbigeo)
                .setParameter("idParentesco", idParentesco)
                .setParameter("telefonoContacto", telefonoContacto)
                .executeUpdate();
    }
}
