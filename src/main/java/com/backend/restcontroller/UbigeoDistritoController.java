package com.backend.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.services.UbigeoDistritoService;

@RestController
@RequestMapping("/api/distritos")
public class UbigeoDistritoController {

    @Autowired
    private UbigeoDistritoService ubigeoDistritoService;

    @GetMapping("/{codigoProvincia}")
    public List<Object[]> buscarPorCodigoProvincia(@PathVariable String codigoProvincia) {
        return ubigeoDistritoService.buscarPorCodigoProvincia(codigoProvincia);
    }
}
