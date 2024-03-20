package com.backend.dao;

import com.backend.model.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PacienteDAO extends JpaRepository<Paciente, Integer> {
    @Query("SELECT p FROM Paciente p WHERE " +
       "(:idTipoDocide IS NULL OR p.idTipoDocide = :idTipoDocide) AND " +
       "(:noDocide IS NULL OR p.noDocide = :noDocide) AND " +
       "(:noApepat IS NULL OR p.noApepat = :noApepat) AND " +
       "(:noApemat IS NULL OR p.noApemat = :noApemat) AND " +
       "(:noNombres IS NULL OR p.noNombres = :noNombres)")
List<Paciente> buscarPacientes(@Param("idTipoDocide") Integer idTipoDocide, 
                               @Param("noDocide") String noDocide, 
                               @Param("noApepat") String noApepat, 
                               @Param("noApemat") String noApemat, 
                               @Param("noNombres") String noNombres);
}