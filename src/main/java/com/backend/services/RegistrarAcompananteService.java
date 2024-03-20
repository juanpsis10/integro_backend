package com.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

import com.backend.dao.RegistrarAcompananteDAO;

@Service
public class RegistrarAcompananteService {

    @Autowired
    private RegistrarAcompananteDAO registrarAcompananteDAO;

    @Transactional
    public void registrarAcompanante(Integer idPaciente, Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno,
            String apellidoMaterno, String nombres, Date fechaNacimiento,
            String direccion, String codigoUbigeo, Integer idParentesco, String telefonoContacto) {

        registrarAcompananteDAO.registrarAcompanante(idPaciente, idTipoDocumento, numeroDocumento, apellidoPaterno,
                apellidoMaterno, nombres, fechaNacimiento, direccion, codigoUbigeo, idParentesco,
                telefonoContacto);
    }
}
