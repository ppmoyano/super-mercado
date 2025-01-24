package com.example.model;

public class Oferta {
    private Long id;
    private String descripcion;
    private double descuento;
    private Long productoId;

    public Oferta(Long id, String descripcion, double descuento, Long productoId) {
        this.id = id;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.productoId = productoId;
    }

    public Oferta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }
}
