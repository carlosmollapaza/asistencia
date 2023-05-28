package com.pefactura.controller;

import com.pefactura.domain.Asistencia;
import com.pefactura.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController
{
    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @GetMapping("/getbyrol")
    public List<Asistencia> getByRol(@RequestParam Integer rolId)
    {
        return asistenciaRepository.getByRolList(rolId);
    }
}