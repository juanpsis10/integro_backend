package com.backend.restcontroller;

import com.backend.services.EditarPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class EditarPacienteController {

    private final EditarPacienteService editarPacienteService;

    @Autowired
    public EditarPacienteController(EditarPacienteService editarPacienteService) {
        this.editarPacienteService = editarPacienteService;
    }

    @PutMapping("api/editar-paciente")
    public void actualizarPaciente(@RequestParam Integer idPaciente, @RequestParam String codigoUbigeo,
                                   @RequestParam String apellidoMaterno, @RequestParam Integer idSexo,
                                   @RequestParam String direccion, @RequestParam String lugarNacimiento,
                                   @RequestParam String codigoAsegurado, @RequestParam String numeroDocumento,
                                   @RequestParam Integer idTipoDocumento, @RequestParam String fechaNacimiento,
                                   @RequestParam String nombres, @RequestParam String apellidoPaterno) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimientoDate = null;
        try {
            fechaNacimientoDate = dateFormat.parse(fechaNacimiento);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }

        
        editarPacienteService.actualizarPaciente(idPaciente, codigoUbigeo, apellidoMaterno, idSexo,
                direccion, lugarNacimiento, codigoAsegurado, numeroDocumento, idTipoDocumento, fechaNacimientoDate,
                nombres, apellidoPaterno);
    }
}
