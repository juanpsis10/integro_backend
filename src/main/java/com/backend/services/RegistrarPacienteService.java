package com.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date; 


import com.backend.dao.RegistrarPacienteDAO;

@Service
public class RegistrarPacienteService {

    @Autowired
    private RegistrarPacienteDAO registrarPacienteDAO;

    @Transactional
    public Integer registrarPaciente(Integer idTipoDocumento, String numeroDocumento, String apellidoPaterno,
            String apellidoMaterno, String nombres, Integer idSexo, Date fechaNacimiento, String lugarNacimiento,
            String direccion, String codigoUbigeo, Integer estado, String codigoAsegurado) {

        return registrarPacienteDAO.registrarPaciente(idTipoDocumento, numeroDocumento, apellidoPaterno,
                apellidoMaterno, nombres, idSexo, fechaNacimiento, lugarNacimiento, direccion, codigoUbigeo, estado,
                codigoAsegurado);
    }
}
