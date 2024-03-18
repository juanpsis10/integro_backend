package com.backend.dao;

import com.backend.model.entity.TipoDocumentoIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoIdentidadDAO extends JpaRepository<TipoDocumentoIdentidad, Integer> {
    // Aquí podrías agregar métodos personalizados para consultas específicas si es necesario
}
