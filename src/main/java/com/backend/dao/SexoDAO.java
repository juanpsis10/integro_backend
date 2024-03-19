package com.backend.dao;

import com.backend.model.entity.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoDAO extends JpaRepository<Sexo, Integer> {
    // Aquí podrías agregar métodos personalizados para consultas específicas si es necesario
}
