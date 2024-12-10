package com.SpringCRUD.demo.model;

import java.util.Date;

public class Reservacion {
    private int idReservacion;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private float total;
    public Reservacion() {

    }

    public Reservacion(int idReservacion, float total, Date fecha_modificacion, Date fecha_creacion) {
        this.idReservacion = idReservacion;
        this.total = total;
        this.fecha_modificacion = fecha_modificacion;
        this.fecha_creacion = fecha_creacion;
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

    @Override
    public String toString() {
        return "Reservacion{" +
                "idReservacion=" + idReservacion +
                ", fecha_creacion=" + fecha_creacion +
                ", fecha_modificacion=" + fecha_modificacion +
                ", total=" + total +
                '}';
    }
}
