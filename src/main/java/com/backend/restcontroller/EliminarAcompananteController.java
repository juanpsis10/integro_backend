package com.backend.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.services.EliminarAcompananteService;

@RestController
@RequestMapping("/api/acompanante")
public class EliminarAcompananteController {

    private final EliminarAcompananteService eliminarAcompananteService;

    @Autowired
    public EliminarAcompananteController(EliminarAcompananteService eliminarAcompananteService) {
        this.eliminarAcompananteService = eliminarAcompananteService;
    }

    @DeleteMapping("/eliminar/{idPaciente}")
    public ResponseEntity<String> eliminarAcompanantePorIdPaciente(@PathVariable Integer idPaciente) {
        eliminarAcompananteService.eliminarAcompanantePorIdPaciente(idPaciente);
        return new ResponseEntity<>("Acompañantes eliminados para el paciente con ID " + idPaciente, HttpStatus.OK);
    }
}
