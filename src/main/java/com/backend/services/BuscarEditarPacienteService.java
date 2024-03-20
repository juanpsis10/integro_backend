package com.backend.services;

import com.backend.dao.BuscarEditarPacienteDAO;

import com.backend.model.entity.BuscarEditarPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BuscarEditarPacienteService {

    private final BuscarEditarPacienteDAO buscarEditarPacienteDAO;

    @Autowired
    public BuscarEditarPacienteService(BuscarEditarPacienteDAO buscarEditarPacienteDAO) {
        this.buscarEditarPacienteDAO = buscarEditarPacienteDAO;
    }

    public Optional<BuscarEditarPaciente> buscarPacientePorId(Integer idPaciente) {
        return buscarEditarPacienteDAO.buscarPacientePorId(idPaciente);
    }
}
