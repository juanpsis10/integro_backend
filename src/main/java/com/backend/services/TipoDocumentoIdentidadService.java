package com.backend.services;

import com.backend.dao.TipoDocumentoIdentidadDAO;
import com.backend.model.entity.TipoDocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoDocumentoIdentidadService {
    private final TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO;

    @Autowired
    public TipoDocumentoIdentidadService(TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO) {
        this.tipoDocumentoIdentidadDAO = tipoDocumentoIdentidadDAO;
    }

    public List<TipoDocumentoIdentidad> getAllTiposDocumentoIdentidad() {
        return tipoDocumentoIdentidadDAO.findAll();
    }
}
