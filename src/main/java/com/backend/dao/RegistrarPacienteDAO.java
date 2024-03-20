package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date; 

import org.springframework.stereotype.Repository;

@Repository
public class RegistrarPacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Integer registrarPaciente(Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno,
            String apellidoMaterno, String nombres, Integer idSexo, Date fechaNacimiento, String lugarNacimiento,
            String direccion, String codigoUbigeo, Integer estado, String codigoAsegurado) {

                String query = "INSERT INTO tb_paciente (id_tipo_docide, no_docide, no_apepat, no_apemat, no_nombres, "
                + "id_sexo, fe_nacimiento, no_lugar_nacimiento, no_direccion, co_ubigeo, fl_estado, co_asegurado) "
                + "VALUES (:idTipoDocumento, :numeroDocumento, :apellidoPaterno, :apellidoMaterno, :nombres, "
                + ":idSexo, :fechaNacimiento, :lugarNacimiento, :direccion, :codigoUbigeo, CAST(:estado AS bit), :codigoAsegurado) " 
                + "RETURNING id_paciente";

                Integer idPaciente = (Integer) entityManager.createNativeQuery(query)
                .setParameter("idTipoDocumento", idTipoDocumento)
                .setParameter("numeroDocumento", numeroDocumento)
                .setParameter("apellidoPaterno", apellidoPaterno)
                .setParameter("apellidoMaterno", apellidoMaterno)
                .setParameter("nombres", nombres)
                .setParameter("idSexo", idSexo)
                .setParameter("fechaNacimiento", fechaNacimiento)
                .setParameter("lugarNacimiento", lugarNacimiento)
                .setParameter("direccion", direccion)
                .setParameter("codigoUbigeo", codigoUbigeo)
                .setParameter("estado", estado)
                .setParameter("codigoAsegurado", codigoAsegurado)
                .getSingleResult();

        return idPaciente;
    }
}
