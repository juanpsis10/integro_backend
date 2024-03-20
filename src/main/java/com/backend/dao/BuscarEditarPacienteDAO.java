package com.backend.dao;

import com.backend.model.entity.BuscarEditarPaciente;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class BuscarEditarPacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<BuscarEditarPaciente> buscarPacientePorId(Integer idPaciente) {
        return Optional.ofNullable(entityManager.find(BuscarEditarPaciente.class, idPaciente));
    }
}
