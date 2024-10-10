package com.example.controller;

import com.example.model.Oferta;
import com.example.service.OfertaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ofertas")
public class OfertaController {

    private final OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @GetMapping
    public List<Oferta> obtenerTodasLasOfertas() {
        return ofertaService.obtenerTodasLasOfertas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oferta> obtenerOfertaPorId(@PathVariable Long id) {
        Oferta oferta = ofertaService.obtenerOfertaPorId(id);
        if (oferta != null) {
            return ResponseEntity.ok(oferta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Oferta agregarOferta(@RequestBody Oferta oferta) {
        return ofertaService.agregarOferta(oferta);
    }
}
