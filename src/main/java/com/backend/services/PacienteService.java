package com.backend.services;

import com.backend.dao.PacienteDAO;
import com.backend.dao.TipoDocumentoIdentidadDAO;
import com.backend.model.dto.PacienteDTO;
import com.backend.model.entity.Paciente;
import com.backend.model.entity.TipoDocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {
    private final PacienteDAO pacienteDAO;
    private final TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO;

    @Autowired
    public PacienteService(PacienteDAO pacienteDAO, TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO) {
        this.pacienteDAO = pacienteDAO;
        this.tipoDocumentoIdentidadDAO = tipoDocumentoIdentidadDAO;
    }

    public List<PacienteDTO> buscarPacientes(Integer idTipoDocide, String noDocide, String noApepat, String noApemat, String noNombres) {
        List<Paciente> pacientes = pacienteDAO.buscarPacientes(idTipoDocide, noDocide, noApepat, noApemat, noNombres);
        
        return pacientes.stream().map(paciente -> {
            TipoDocumentoIdentidad tipoDocumento = tipoDocumentoIdentidadDAO.findById(paciente.getIdTipoDocide()).orElse(null);
            return new PacienteDTO(
                    paciente.getNoApepat(),
                    paciente.getNoApemat(),
                    paciente.getNoNombres(),
                    paciente.getNoDocide(),
                    paciente.getFlEstado(),
                    paciente.getFeNacimiento(),
                    paciente.getCoAsegurado(),
                    tipoDocumento != null ? tipoDocumento.getDescripcion() : ""
            );
        }).collect(Collectors.toList());
    }
}
