package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
@Transactional
public class EditarPacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void actualizarPaciente(Integer idPaciente, String codigoUbigeo, String apellidoMaterno,
            Integer idSexo, String direccion, String lugarNacimiento, String asegurado,
            String numeroDocumentoIdentidad, Integer idTipoDocumentoIdentidad, Date fechaNacimiento,
            String nombres, String apellidoPaterno) {

        String queryString = "UPDATE EditarPaciente SET codigoUbigeo = :codigoUbigeo, "
                + "apellidoMaterno = :apellidoMaterno, idSexo = :idSexo, "
                + "direccion = :direccion, lugarNacimiento = :lugarNacimiento, asegurado = :asegurado, "
                + "numeroDocumentoIdentidad = :numeroDocumentoIdentidad, idTipoDocumentoIdentidad = :idTipoDocumentoIdentidad, "
                + "fechaNacimiento = :fechaNacimiento, nombres = :nombres, apellidoPaterno = :apellidoPaterno "
                + "WHERE idPaciente = :idPaciente";

        entityManager.createQuery(queryString)
                .setParameter("codigoUbigeo", codigoUbigeo)
                .setParameter("apellidoMaterno", apellidoMaterno)
                .setParameter("idSexo", idSexo)
                .setParameter("direccion", direccion)
                .setParameter("lugarNacimiento", lugarNacimiento)
                .setParameter("asegurado", asegurado)
                .setParameter("numeroDocumentoIdentidad", numeroDocumentoIdentidad)
                .setParameter("idTipoDocumentoIdentidad", idTipoDocumentoIdentidad)
                .setParameter("fechaNacimiento", fechaNacimiento)
                .setParameter("nombres", nombres)
                .setParameter("apellidoPaterno", apellidoPaterno)
                .setParameter("idPaciente", idPaciente)
                .executeUpdate();
    }
}
