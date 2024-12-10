package com.SpringCRUD.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destino;
    private Date fecha_salida;
    private Date fecha_llegada;
    private String asientos;
    private String imagen;
    private float costo_unico;
    @ManyToOne
    private Usuario usuario;

    public Viaje (){

    }

    public Viaje(int id, String destino, Date fecha_salida, Date fecha_llegada, String asientos, String imagen,float costo_unico, Usuario usuario) {
        this.id = id;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.asientos = asientos;
        this.imagen = imagen;
        this.costo_unico=costo_unico;
        this.usuario=usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public float getCosto_unico() {
        return costo_unico;
    }

    public void setCosto_unico(float costo_unico) {
        this.costo_unico = costo_unico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "id=" + id +
                ", destino='" + destino + '\'' +
                ", fecha_salida=" + fecha_salida +
                ", fecha_llegada=" + fecha_llegada +
                ", asientos='" + asientos + '\'' +
                ", imagen='" + imagen + '\'' +
                ", costo_unico=" + costo_unico +
                ", usuario=" + usuario +
                '}';
    }
}
