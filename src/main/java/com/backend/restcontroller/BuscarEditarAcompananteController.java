package com.backend.restcontroller;

import com.backend.model.entity.BuscarEditarAcompanante;
import com.backend.services.BuscarEditarAcompananteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/acompanante/editar")
public class BuscarEditarAcompananteController {

    private final BuscarEditarAcompananteService buscarEditarAcompananteService;

    @Autowired
    public BuscarEditarAcompananteController(BuscarEditarAcompananteService buscarEditarAcompananteService) {
        this.buscarEditarAcompananteService = buscarEditarAcompananteService;
    }

    @GetMapping("/buscar/{idPaciente}")
    public ResponseEntity<BuscarEditarAcompanante> buscarAcompanantePorId(@PathVariable Integer idPaciente) {
        Optional<BuscarEditarAcompanante> acompananteOptional = buscarEditarAcompananteService.buscarAcompanantePorId(idPaciente);
        return acompananteOptional.map(acompanante -> new ResponseEntity<>(acompanante, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
