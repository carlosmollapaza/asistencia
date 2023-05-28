package com.pefactura.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(schema = "public", name = "alumno")
public class Alumno
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String dni;

    private String paterno;
    private String materno;
    private String nombres;
    private Date nacimiento;

    public Alumno()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getPaterno()
    {
        return paterno;
    }

    public void setPaterno(String paterno)
    {
        this.paterno = paterno;
    }

    public String getMaterno()
    {
        return materno;
    }

    public void setMaterno(String materno)
    {
        this.materno = materno;
    }

    public String getNombres()
    {
        return nombres;
    }

    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }

    public Date getNacimiento()
    {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento)
    {
        this.nacimiento = nacimiento;
    }
}