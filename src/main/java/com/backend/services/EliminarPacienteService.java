package com.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.backend.dao.EliminarPacienteDAO;

@Service
public class EliminarPacienteService {

    @Autowired
    private EliminarPacienteDAO eliminarPacienteDAO;

    @Transactional
    public void eliminarPaciente(Integer idPaciente) {
        eliminarPacienteDAO.eliminarPacientePorId(idPaciente);
    }
}
