package com.backend.restcontroller;


import com.backend.services.UbigeoDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/ubigeo-departamentos")
public class UbigeoDepartamentoController {
    private final UbigeoDepartamentoService ubigeoDepartamentoService;

    @Autowired
    public UbigeoDepartamentoController(UbigeoDepartamentoService ubigeoDepartamentoService) {
        this.ubigeoDepartamentoService = ubigeoDepartamentoService;
    }

    @GetMapping
    public List<Object[]> getAllUbigeoDepartamentos() {
        return ubigeoDepartamentoService.findAllGroupByCodigoDepartamento();
    }
}
