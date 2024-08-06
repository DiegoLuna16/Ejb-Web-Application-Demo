package org.diegovelu.webapp.ejb.service;

import jakarta.ejb.Stateless;
import org.diegovelu.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;


@Stateless
public class ServiceEjb implements ServiceEjbLocal {

    private int contador;


    public String saludar(String nombre) {
        System.out.println("Imprimiendo dentro del ejb con instancia: " + this);
        contador++;
        System.out.println("valor del contador: " + contador);
        return  "Hola " + nombre;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("manzanas"));
        productos.add(new Producto("peras"));
        productos.add(new Producto("leche"));
        return productos;
    }

    @Override
    public Producto crear(Producto producto) {
        System.out.println("guardando el producto ... " + producto);
        Producto p = new Producto();
        p.setNombre(producto.getNombre());
        return p;
    }

}
