package com.backend.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.services.EliminarPacienteService;

@RestController
@RequestMapping("/api/paciente/eliminar")
public class EliminarPacienteController {

    @Autowired
    private EliminarPacienteService eliminarPacienteService;

    @DeleteMapping("/{idPaciente}")
    public void eliminarPaciente(@PathVariable Integer idPaciente) {
        eliminarPacienteService.eliminarPaciente(idPaciente);
    }
}
