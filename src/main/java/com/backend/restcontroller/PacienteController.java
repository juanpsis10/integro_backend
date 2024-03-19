package com.backend.restcontroller;

import com.backend.model.dto.PacienteDTO;
import com.backend.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/buscar")
    public List<PacienteDTO> buscarPacientes(
            @RequestParam(required = false) Integer idTipoDocide,
            @RequestParam(required = false) String noDocide,
            @RequestParam(required = false) String noApepat,
            @RequestParam(required = false) String noApemat,
            @RequestParam(required = false) String noNombres
    ) {
        return pacienteService.buscarPacientes(idTipoDocide, noDocide, noApepat, noApemat, noNombres);
    }
}
