package com.example.service;

import com.example.model.Oferta;
import com.example.repository.OfertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaService {

    private final OfertaRepository ofertaRepository;

    public OfertaService(OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }

    public List<Oferta> obtenerTodasLasOfertas() {
        return ofertaRepository.findAll();
    }

    public Oferta obtenerOfertaPorId(Long id) {
        return ofertaRepository.findById(id);
    }

    public Oferta agregarOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }
}
