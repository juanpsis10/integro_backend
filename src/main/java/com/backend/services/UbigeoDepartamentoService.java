package com.backend.services;

import com.backend.dao.UbigeoDepartamentoDAO;
//import com.backend.model.entity.UbigeoDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UbigeoDepartamentoService {
    private final UbigeoDepartamentoDAO ubigeoDepartamentoDAO;

    @Autowired
    public UbigeoDepartamentoService(UbigeoDepartamentoDAO ubigeoDepartamentoDAO) {
        this.ubigeoDepartamentoDAO = ubigeoDepartamentoDAO;
    }

    public List<Object[]> findAllGroupByCodigoDepartamento() {
        return ubigeoDepartamentoDAO.findAllGroupByCodigoDepartamento();
    }
}
