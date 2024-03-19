package com.backend.restcontroller;

import com.backend.model.entity.Sexo;
import com.backend.services.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/sexos")
public class SexoController {
    private final SexoService sexoService;

    @Autowired
    public SexoController(SexoService sexoService) {
        this.sexoService = sexoService;
    }

    @GetMapping
    public List<Sexo> getAllSexos() {
        return sexoService.getAllSexos();
    }
}
