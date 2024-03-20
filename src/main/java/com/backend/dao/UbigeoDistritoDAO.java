package com.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.model.entity.UbigeoDistrito;

public interface UbigeoDistritoDAO extends JpaRepository<UbigeoDistrito, String> {

    @Query("SELECT u.descripcionDistrito, u.codigoDistrito, u.estado FROM UbigeoDistrito u WHERE u.codigoDepartamento = :codigoDepartamento AND u.codigoProvincia = :codigoProvincia GROUP BY u.descripcionDistrito, u.codigoDistrito, u.estado")
    List<Object[]> buscarPorCodigosDepartamentoYProvincia(@Param("codigoDepartamento") String codigoDepartamento, @Param("codigoProvincia") String codigoProvincia);
}
