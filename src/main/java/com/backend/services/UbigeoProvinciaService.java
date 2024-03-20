package com.backend.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.UbigeoProvinciaDAO;

@Service
public class UbigeoProvinciaService {

    @Autowired
    private UbigeoProvinciaDAO ubigeoProvinciaDAO;

    public List<Object[]> buscarPorCodigoDepartamento(String codigoDepartamento) {
        return ubigeoProvinciaDAO.buscarPorCodigoDepartamento(codigoDepartamento);
    }
}
