package com.example.service;

import com.example.model.Carrito;
import com.example.model.Producto;
import com.example.model.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoService {


    private final Carrito carrito = new Carrito();
    @Autowired
    private OfertaService ofertaService;
    @Autowired
    private ProductoService productoService;

    public String agregarProductoAlCarrito(Producto producto) {

        Producto productoExistente = productoService.obtenerProductoPorId(producto.getId());
        carrito.getProductos().add(productoExistente);
        return "Producto agregado: " + productoExistente.getNombre();
    }

    public List<Producto> verCarrito() {
        return carrito.getProductos();
    }

    public double calcularTotalConOfertas() {
        double total = 0.0;
        for (Producto producto : carrito.getProductos()) {
            double precioConDescuento = aplicarOfertasSiCorresponde(producto);
            total += precioConDescuento;
        }
        return total;
    }

    private double aplicarOfertasSiCorresponde(Producto producto) {
        // Aquí puedes agregar las ofertas disponibles.
        List<Oferta> ofertas = ofertaService.obtenerTodasLasOfertas();
        /*
        Falta implementar ofertas
        */
        return producto.getPrecio(); // No hay descuento, devuelve el precio original.
    }
}
