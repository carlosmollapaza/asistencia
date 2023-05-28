package com.pefactura.repository;

import com.pefactura.domain.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer>, AsistenciaDao
{
    @Query("SELECT a FROM Asistencia a WHERE a.id = :id")
    Asistencia getById(@Param("id") Integer id);
}