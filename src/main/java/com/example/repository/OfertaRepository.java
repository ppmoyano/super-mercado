package com.example.repository;

import com.example.model.Oferta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OfertaRepository {
    private List<Oferta> ofertas = new ArrayList<>();

    public OfertaRepository() {
        ofertas.add(new Oferta(1L, "Oferta 1", 50.0, 30L)); //salsa quedaria a 1$
        ofertas.add(new Oferta(2L, "Oferta 2", 20.0, 46L)); //desodorante quedaria a 2,4$
    }

    public List<Oferta> findAll() {
        return ofertas;
    }

    public Oferta findById(Long id) {
        return ofertas.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
    }

    public Oferta save(Oferta oferta) {
        oferta.setId((long) (ofertas.size() + 1));
        ofertas.add(oferta);
        return oferta;
    }
}
