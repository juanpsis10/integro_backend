package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
@Transactional
public class EditarAcompananteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void actualizarAcompanante(Integer idPaciente, String codigoUbigeo, String apellidoMaterno,
            Date fechaNacimiento, Integer idTipoDocumentoIdentidad, String nombres, Integer idParentesco,
            String numeroDocumentoIdentidad, String direccion, String telefonoContacto, String apellidoPaterno) {

        String queryString = "UPDATE EditarAcompanante SET codigoUbigeo = :codigoUbigeo, "
                + "apellidoMaterno = :apellidoMaterno, fechaNacimiento = :fechaNacimiento, "
                + "idTipoDocumentoIdentidad = :idTipoDocumentoIdentidad, nombres = :nombres, "
                + "idParentesco = :idParentesco, numeroDocumentoIdentidad = :numeroDocumentoIdentidad, "
                + "direccion = :direccion, telefonoContacto = :telefonoContacto, "
                + "apellidoPaterno = :apellidoPaterno WHERE idPaciente = :idPaciente";

        entityManager.createQuery(queryString)
                .setParameter("codigoUbigeo", codigoUbigeo)
                .setParameter("apellidoMaterno", apellidoMaterno)
                .setParameter("fechaNacimiento", fechaNacimiento)
                .setParameter("idTipoDocumentoIdentidad", idTipoDocumentoIdentidad)
                .setParameter("nombres", nombres)
                .setParameter("idParentesco", idParentesco)
                .setParameter("numeroDocumentoIdentidad", numeroDocumentoIdentidad)
                .setParameter("direccion", direccion)
                .setParameter("telefonoContacto", telefonoContacto)
                .setParameter("apellidoPaterno", apellidoPaterno)
                .setParameter("idPaciente", idPaciente)
                .executeUpdate();
    }
}
