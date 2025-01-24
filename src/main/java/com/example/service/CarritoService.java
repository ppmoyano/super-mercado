package com.example.service;

import com.example.model.Carrito;
import com.example.model.Producto;
import com.example.model.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService {

    private final RestTemplate restTemplate = new RestTemplate();
    private Carrito carrito = new Carrito();
    @Autowired
    private OfertaService ofertaService;
    @Autowired
    private ProductoService productoService;

    public String agregarProductoAlCarrito(Producto producto) {
        //aqui lo modifico para usar el endpoint
        // URL del endpoint
        String url = "http://localhost:8282/api/productos/" + producto.getId();
        // Llamada GET y mapeo de la respuesta a una clase Producto
        Producto productoExistente = restTemplate.getForObject(url, Producto.class);
//        Producto productoExistente = productoService.obtenerProductoPorId(producto.getId());
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
        String url = "http://localhost:8282/api/ofertas";
        ResponseEntity<List<Oferta>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null, // Si no necesitas enviar un cuerpo o headers, puedes usar null.
                new ParameterizedTypeReference<List<Oferta>>() {}
        );
        List<Oferta> ofertas = response.getBody();

//        List<Oferta> ofertas = ofertaService.obtenerTodasLasOfertas();
        for (Oferta oferta : ofertas) {
            if (oferta.getProductoId().equals(producto.getId())) {
                return producto.getPrecio() * (1 - oferta.getDescuento() / 100);
            }
        }
        return producto.getPrecio(); // No hay descuento, devuelve el precio original.
    }
}
