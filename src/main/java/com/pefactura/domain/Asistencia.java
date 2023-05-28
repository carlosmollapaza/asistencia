package com.pefactura.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(schema = "public", name = "asistencia")
public class Asistencia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "rol")
    private Rol rol;

    private Integer entidadId;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.TIME)
    private Date entrada;

    @Temporal(TemporalType.TIME)
    private Date salida;

    private Integer estado;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Rol getRol()
    {
        return rol;
    }

    public void setRol(Rol rol)
    {
        this.rol = rol;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Date getEntrada()
    {
        return entrada;
    }

    public void setEntrada(Date entrada)
    {
        this.entrada = entrada;
    }

    public Date getSalida()
    {
        return salida;
    }

    public void setSalida(Date salida)
    {
        this.salida = salida;
    }

    public Integer getEstado()
    {
        return estado;
    }

    public void setEstado(Integer estado)
    {
        this.estado = estado;
    }

    public Integer getEntidadId()
    {
        return entidadId;
    }

    public void setEntidadId(Integer entidadId)
    {
        this.entidadId = entidadId;
    }
}