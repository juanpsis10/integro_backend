package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class EliminarPacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void eliminarPacientePorId(Integer idPaciente) {
        entityManager.createQuery("DELETE FROM EliminarPaciente p WHERE p.idPaciente = :idPaciente")
             .setParameter("idPaciente", idPaciente)
             .executeUpdate();

    }
}
