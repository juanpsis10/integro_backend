package com.backend.services;

import com.backend.dao.ParentescoDAO;
import com.backend.model.entity.Parentesco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParentescoService {
    private final ParentescoDAO parentescoDAO;

    @Autowired
    public ParentescoService(ParentescoDAO parentescoDAO) {
        this.parentescoDAO = parentescoDAO;
    }

    public List<Parentesco> getAllParentescos() {
        return parentescoDAO.findAll();
    }
}
