package com.backend.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.dto.RegistrarAcompananteDTO;
import com.backend.services.RegistrarAcompananteService;

@RestController
@RequestMapping("/api/acompanantes")
public class RegistrarAcompananteController {

    @Autowired
    private RegistrarAcompananteService registrarAcompananteService;

    @PostMapping("/registrar")
    public void registrarAcompanante(@RequestBody RegistrarAcompananteDTO acompananteDTO) {
        registrarAcompananteService.registrarAcompanante(acompananteDTO.getIdPaciente(),
                acompananteDTO.getIdTipoDocumento(), acompananteDTO.getNumeroDocumento(),
                acompananteDTO.getApellidoPaterno(), acompananteDTO.getApellidoMaterno(),
                acompananteDTO.getNombres(), acompananteDTO.getFechaNacimiento()
                , acompananteDTO.getDireccion(),
                acompananteDTO.getCodigoUbigeo(), acompananteDTO.getIdParentesco(),
                acompananteDTO.getTelefonoContacto());
    }
}
