package com.backend.restcontroller;

import com.backend.model.entity.Parentesco;
import com.backend.services.ParentescoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/parentescos")
public class ParentescoController {
    private final ParentescoService parentescoService;

    @Autowired
    public ParentescoController(ParentescoService parentescoService) {
        this.parentescoService = parentescoService;
    }

    @GetMapping
    public List<Parentesco> getAllParentescos() {
        return parentescoService.getAllParentescos();
    }
}
