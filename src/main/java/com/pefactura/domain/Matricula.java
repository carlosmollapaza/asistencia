package com.pefactura.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "matricula")
public class Matricula
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "alumno")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "grupo")
    private Grupo grupo;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Alumno getAlumno()
    {
        return alumno;
    }

    public void setAlumno(Alumno alumno)
    {
        this.alumno = alumno;
    }

    public Grupo getGrupo()
    {
        return grupo;
    }

    public void setGrupo(Grupo grupo)
    {
        this.grupo = grupo;
    }
}