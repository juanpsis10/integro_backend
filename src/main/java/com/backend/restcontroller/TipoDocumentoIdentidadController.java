package com.backend.restcontroller;

import com.backend.model.entity.TipoDocumentoIdentidad;
import com.backend.services.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/tipos-documento-identidad")
public class TipoDocumentoIdentidadController {
    private final TipoDocumentoIdentidadService tipoDocumentoIdentidadService;

    @Autowired
    public TipoDocumentoIdentidadController(TipoDocumentoIdentidadService tipoDocumentoIdentidadService) {
        this.tipoDocumentoIdentidadService = tipoDocumentoIdentidadService;
    }

    @GetMapping
    public List<TipoDocumentoIdentidad> getAllTiposDocumentoIdentidad() {
        return tipoDocumentoIdentidadService.getAllTiposDocumentoIdentidad();
    }
}
