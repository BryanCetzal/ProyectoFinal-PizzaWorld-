package com.app.interfazusuario_wp;
/**
 * Es la clase padre encargada de brindar todos los atributos de sus clases hijas.
 */

public class Alimento {
    protected Integer cantidadDispo;
    protected String nombre;
    protected float precio;
    protected String descripcion;

    public Alimento(Integer cantidadDispo, String nombre, float precio, String descripcion) {
        this.cantidadDispo = cantidadDispo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Alimento(Integer cantidadDispo, String nombre, float precio) {
        this.cantidadDispo = cantidadDispo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Alimento() {
    }

    public Integer getCantidadDispo() {
        return cantidadDispo;
    }

    public void setCantidadDispo(Integer cantidadDispo) {
        this.cantidadDispo = cantidadDispo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "cantidadDispo=" + cantidadDispo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
