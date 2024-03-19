package com.backend.services;

import com.backend.dao.SexoDAO;
import com.backend.model.entity.Sexo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SexoService {
    private final SexoDAO sexoDAO;

    @Autowired
    public SexoService(SexoDAO sexoDAO) {
        this.sexoDAO = sexoDAO;
    }

    public List<Sexo> getAllSexos() {
        return sexoDAO.findAll();
    }
}
