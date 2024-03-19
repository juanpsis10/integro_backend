package com.backend.dao;

import com.backend.model.entity.Parentesco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentescoDAO extends JpaRepository<Parentesco, Integer> {
    // Aquí podrías agregar métodos personalizados para consultas específicas si es necesario
}
