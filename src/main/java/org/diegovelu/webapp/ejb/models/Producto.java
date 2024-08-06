package org.diegovelu.webapp.ejb.models;

public class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
