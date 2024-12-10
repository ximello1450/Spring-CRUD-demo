package com.SpringCRUD.demo.model;

public class DetalleReservacion {
    private int idDetalleReservacion;
    private int nombre;
    private float cantidad_asientos;
    private float precio;
    private float total;

    public DetalleReservacion(){

    }

    public DetalleReservacion(int idDetalleReservacion, int nombre, float cantidad_asientos, float precio, float total) {
        this.idDetalleReservacion = idDetalleReservacion;
        this.nombre = nombre;
        this.cantidad_asientos = cantidad_asientos;
        this.precio = precio;
        this.total = total;
    }

    public int getIdDetalleReservacion() {
        return idDetalleReservacion;
    }

    public void setIdDetalleReservacion(int idDetalleReservacion) {
        this.idDetalleReservacion = idDetalleReservacion;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public float getCantidad_asientos() {
        return cantidad_asientos;
    }

    public void setCantidad_asientos(float cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String
    toString() {
        return "DetalleReservacion{" +
                "idDetalleReservacion=" + idDetalleReservacion +
                ", nombre=" + nombre +
                ", cantidad_asientos=" + cantidad_asientos +
                ", precio=" + precio +
                ", total=" + total +
                '}';
    }
}