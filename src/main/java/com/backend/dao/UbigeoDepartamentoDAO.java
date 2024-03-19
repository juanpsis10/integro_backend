package com.backend.dao;

import com.backend.model.entity.UbigeoDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UbigeoDepartamentoDAO extends JpaRepository<UbigeoDepartamento, Long> {
    @Query(value = "SELECT descripcion_departamento, codigo_departamento, fl_estado FROM admision.tc_ubigeo GROUP BY descripcion_departamento, codigo_departamento, fl_estado", nativeQuery = true)
    List<Object[]> findAllGroupByCodigoDepartamento();
}