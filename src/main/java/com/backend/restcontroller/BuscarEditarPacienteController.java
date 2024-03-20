package com.backend.restcontroller;


import com.backend.model.entity.BuscarEditarPaciente;
import com.backend.services.BuscarEditarPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/paciente/editar")
public class BuscarEditarPacienteController {

    private final BuscarEditarPacienteService buscarEditarPacienteService;

    @Autowired
    public BuscarEditarPacienteController(BuscarEditarPacienteService buscarEditarPacienteService) {
        this.buscarEditarPacienteService = buscarEditarPacienteService;
    }

    @GetMapping("/buscar/{idPaciente}")
    public ResponseEntity<BuscarEditarPaciente> buscarPacientePorId(@PathVariable Integer idPaciente) {
        Optional<BuscarEditarPaciente> pacienteOptional = buscarEditarPacienteService.buscarPacientePorId(idPaciente);
        return pacienteOptional.map(paciente -> new ResponseEntity<>(paciente, HttpStatus.OK))
                                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

