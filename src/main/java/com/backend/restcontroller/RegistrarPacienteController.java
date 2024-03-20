package com.backend.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.dto.RegistrarPacienteDTO; 
import com.backend.services.RegistrarPacienteService;

@RestController
@RequestMapping("/api/pacientes")
public class RegistrarPacienteController {

    @Autowired
    private RegistrarPacienteService registrarPacienteService;

    @PostMapping("/registrar")
    public Integer registrarPaciente(@RequestBody RegistrarPacienteDTO pacienteDTO) { 
        return registrarPacienteService.registrarPaciente(pacienteDTO.getIdTipoDocumento(),
                pacienteDTO.getNumeroDocumento(), pacienteDTO.getApellidoPaterno(),
                pacienteDTO.getApellidoMaterno(), pacienteDTO.getNombres(), pacienteDTO.getIdSexo(),
                pacienteDTO.getFechaNacimiento(), pacienteDTO.getLugarNacimiento(),
                pacienteDTO.getDireccion(), pacienteDTO.getCodigoUbigeo(), pacienteDTO.getEstado(),
                pacienteDTO.getCodigoAsegurado());
    }
}
