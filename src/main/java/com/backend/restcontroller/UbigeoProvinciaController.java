package com.backend.restcontroller;

// UbigeoProvinciaController.java
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.services.UbigeoProvinciaService;

@RestController
@RequestMapping("api/provincias")
public class UbigeoProvinciaController {

    @Autowired
    private UbigeoProvinciaService ubigeoProvinciaService;

    @GetMapping("/{codigoDepartamento}")
    public List<Object[]> buscarPorCodigoDepartamento(@PathVariable String codigoDepartamento) {
        return ubigeoProvinciaService.buscarPorCodigoDepartamento(codigoDepartamento);
    }
}
