package com.backend.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.services.UbigeoDistritoService;

@RestController
@RequestMapping("/api/distritos")
public class UbigeoDistritoController {

    @Autowired
    private UbigeoDistritoService ubigeoDistritoService;

    @GetMapping
    public List<Object[]> obtenerDistritosPorDepartamentoYProvincia(@RequestParam("codigoDepartamento") String codigoDepartamento, @RequestParam("codigoProvincia") String codigoProvincia) {
        return ubigeoDistritoService.buscarPorCodigosDepartamentoYProvincia(codigoDepartamento, codigoProvincia);
    }
}
