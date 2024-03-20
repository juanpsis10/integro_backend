package com.backend.dao;

import com.backend.model.entity.BuscarEditarAcompanante;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class BuscarEditarAcompananteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<BuscarEditarAcompanante> buscarAcompanantePorIdPaciente(Integer idPaciente) {
        List<BuscarEditarAcompanante> result = entityManager.createQuery(
            "SELECT a FROM BuscarEditarAcompanante a WHERE a.idPaciente = :idPaciente", BuscarEditarAcompanante.class)
            .setParameter("idPaciente", idPaciente)
            .getResultList();

        return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
    }
}
