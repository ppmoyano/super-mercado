package com.example.service;

import com.example.model.Producto;
import com.example.model.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService {

    private List<Producto> carrito = new ArrayList<>();
    private List<Oferta> ofertas = new ArrayList<>(); // Aquí puedes agregar las ofertas disponibles.
    @Autowired
    private OfertaService ofertaService;

    public String agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
        return "Producto agregado: " + producto.getNombre();
    }

    public List<Producto> verCarrito() {
        return carrito;
    }

    public double calcularTotalConOfertas() {
        double total = 0.0;
        for (Producto producto : carrito) {
            double precioConDescuento = aplicarOfertasSiCorresponde(producto);
            total += precioConDescuento;
        }
        return total;
    }

    private double aplicarOfertasSiCorresponde(Producto producto) {
        ofertas = ofertaService.obtenerTodasLasOfertas();
        /*
        Falta implementar ofertas
        */
        return producto.getPrecio(); // No hay descuento, devuelve el precio original.
    }
}
