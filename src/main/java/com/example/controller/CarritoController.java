package com.example.controller;

import com.example.model.Producto;
import com.example.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @PostMapping("/agregar")
    public String agregarProductoAlCarrito(@RequestBody Producto producto) {
        return carritoService.agregarProductoAlCarrito(producto);
    }

    @GetMapping("/ver")
    public List<Producto> verCarrito() {
        return carritoService.verCarrito();
    }

    @GetMapping("/total")
    public double obtenerTotalConOfertas() {
        return carritoService.calcularTotalConOfertas();
    }
}
