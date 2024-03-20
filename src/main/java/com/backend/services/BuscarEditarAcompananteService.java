package com.backend.services;

import com.backend.dao.BuscarEditarAcompananteDAO;
import com.backend.model.entity.BuscarEditarAcompanante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BuscarEditarAcompananteService {

    private final BuscarEditarAcompananteDAO buscarEditarAcompananteDAO;

    @Autowired
    public BuscarEditarAcompananteService(BuscarEditarAcompananteDAO buscarEditarAcompananteDAO) {
        this.buscarEditarAcompananteDAO = buscarEditarAcompananteDAO;
    }

    public Optional<BuscarEditarAcompanante> buscarAcompanantePorId(Integer idPaciente) {
        return buscarEditarAcompananteDAO.buscarAcompanantePorIdPaciente(idPaciente);
    }
}
