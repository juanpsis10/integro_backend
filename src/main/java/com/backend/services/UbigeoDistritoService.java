package com.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.UbigeoDistritoDAO;

@Service
public class UbigeoDistritoService {

    @Autowired
    private UbigeoDistritoDAO ubigeoDistritoDAO;

    public List<Object[]> buscarPorCodigoProvincia(String codigoProvincia) {
        return ubigeoDistritoDAO.buscarPorCodigoProvincia(codigoProvincia);
    }
}
