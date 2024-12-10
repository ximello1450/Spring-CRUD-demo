package com.SpringCRUD.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table (name="reservaciones")
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservacion;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private float total;
    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "reservacion")
    private DetalleReservacion detalleReservacion;
    public Reservacion() {

    }

    public Reservacion(int idReservacion, Date fecha_creacion, Date fecha_modificacion, float total, Usuario usuario, DetalleReservacion detalleReservacion) {
        this.idReservacion = idReservacion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.total = total;
        this.usuario = usuario;
        this.detalleReservacion = detalleReservacion;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DetalleReservacion getDetalleReservacion() {
        return detalleReservacion;
    }

    public void setDetalleReservacion(DetalleReservacion detalleReservacion) {
        this.detalleReservacion = detalleReservacion;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "idReservacion=" + idReservacion +
                ", fecha_creacion=" + fecha_creacion +
                ", fecha_modificacion=" + fecha_modificacion +
                ", total=" + total +
                ", usuario=" + usuario +
                ", detalleReservacion=" + detalleReservacion +
                '}';
    }
}
