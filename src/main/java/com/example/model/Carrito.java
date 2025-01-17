package com.example.model;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    private List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
