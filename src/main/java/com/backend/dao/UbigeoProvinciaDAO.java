package com.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.model.entity.UbigeoProvincia;

public interface UbigeoProvinciaDAO extends JpaRepository<UbigeoProvincia, String> {

    @Query("SELECT u.descripcionProvincia, u.codigoProvincia, u.estado FROM UbigeoProvincia u WHERE u.codigoDepartamento = :codigoDepartamento GROUP BY u.descripcionProvincia, u.codigoProvincia, u.estado")
    List<Object[]> buscarPorCodigoDepartamento(@Param("codigoDepartamento") String codigoDepartamento);
}
