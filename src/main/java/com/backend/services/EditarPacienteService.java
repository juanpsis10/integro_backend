package com.backend.services;

import com.backend.dao.EditarPacienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class EditarPacienteService {

    private final EditarPacienteDAO editarPacienteDAO;

    @Autowired
    public EditarPacienteService(EditarPacienteDAO editarPacienteDAO) {
        this.editarPacienteDAO = editarPacienteDAO;
    }

    public void actualizarPaciente(Integer idPaciente, String codigoUbigeo, String apellidoMaterno,
                                    Integer idSexo, String direccion, String lugarNacimiento,
                                    String codigoAsegurado, String numeroDocumento, Integer idTipoDocumento,
                                    Date fechaNacimiento, String nombres, String apellidoPaterno) {
        editarPacienteDAO.actualizarPaciente(idPaciente, codigoUbigeo, apellidoMaterno, idSexo,
                direccion, lugarNacimiento, codigoAsegurado, numeroDocumento, idTipoDocumento, fechaNacimiento,
                nombres, apellidoPaterno);
    }
}

