package com.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class EliminarAcompananteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void eliminarAcompanantePorIdPaciente(Integer idPaciente) {
        entityManager.createQuery("DELETE FROM EliminarAcompanante a WHERE a.idPaciente = :idPaciente")
             .setParameter("idPaciente", idPaciente)
             .executeUpdate();
    }
}
