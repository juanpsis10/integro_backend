package com.backend.services;

import com.backend.dao.EditarAcompananteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EditarAcompananteService {

    private final EditarAcompananteDAO editarAcompananteDAO;

    @Autowired
    public EditarAcompananteService(EditarAcompananteDAO editarAcompananteDAO) {
        this.editarAcompananteDAO = editarAcompananteDAO;
    }

    public void actualizarAcompanante(Integer idPaciente, String codigoUbigeo, String apellidoMaterno,
                                       Date fechaNacimiento, Integer idTipoDocumentoIdentidad, String nombres,
                                       Integer idParentesco, String numeroDocumentoIdentidad, String direccion,
                                       String telefonoContacto, String apellidoPaterno) {
        editarAcompananteDAO.actualizarAcompanante(idPaciente, codigoUbigeo, apellidoMaterno, fechaNacimiento,
                idTipoDocumentoIdentidad, nombres, idParentesco, numeroDocumentoIdentidad, direccion,
                telefonoContacto, apellidoPaterno);
    }
}
