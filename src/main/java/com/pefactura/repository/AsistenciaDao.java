package com.pefactura.repository;

import com.pefactura.domain.Asistencia;
import java.util.List;

public interface AsistenciaDao
{
    List<Asistencia> getByRolList(Integer rolId);
}