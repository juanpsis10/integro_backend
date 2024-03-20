package com.backend.restcontroller;

import com.backend.services.EditarAcompananteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class EditarAcompananteController {

    private final EditarAcompananteService editarAcompananteService;

    @Autowired
    public EditarAcompananteController(EditarAcompananteService editarAcompananteService) {
        this.editarAcompananteService = editarAcompananteService;
    }

    @PutMapping("api/editar-acompanante")
    public void actualizarAcompanante(@RequestParam Integer idPaciente, @RequestParam String codigoUbigeo,
                                      @RequestParam String apellidoMaterno, @RequestParam String fechaNacimiento,
                                      @RequestParam Integer idTipoDocumentoIdentidad, @RequestParam String nombres,
                                      @RequestParam Integer idParentesco, @RequestParam String numeroDocumentoIdentidad,
                                      @RequestParam String direccion, @RequestParam String telefonoContacto,
                                      @RequestParam String apellidoPaterno) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimientoDate = null;
        try {
            fechaNacimientoDate = dateFormat.parse(fechaNacimiento);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }

        
        editarAcompananteService.actualizarAcompanante(idPaciente, codigoUbigeo, apellidoMaterno, fechaNacimientoDate,
                idTipoDocumentoIdentidad, nombres, idParentesco, numeroDocumentoIdentidad, direccion,
                telefonoContacto, apellidoPaterno);
    }
}
