package com.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.EliminarAcompananteDAO;

@Service
public class EliminarAcompananteService {

    private final EliminarAcompananteDAO eliminarAcompananteDAO;

    @Autowired
    public EliminarAcompananteService(EliminarAcompananteDAO eliminarAcompananteDAO) {
        this.eliminarAcompananteDAO = eliminarAcompananteDAO;
    }

    public void eliminarAcompanantePorIdPaciente(Integer idPaciente) {
        eliminarAcompananteDAO.eliminarAcompanantePorIdPaciente(idPaciente);
    }
}
