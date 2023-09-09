package com.juan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private String numeroPedido;
    private LocalDate fechaEntrega;
    private ArrayList <Articulo> articulos;
    private ArrayList <Remito> remitos;
    private EstadoPedido estadoPedido;

    public Pedido() {
        articulos = new ArrayList<Articulo>();
        remitos = new ArrayList<Remito> ();
        estadoPedido = new Abierto();
    }

    public String getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getFechaEntrega() {
        return this.fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public ArrayList<Articulo> getArticulos() {
        return this.articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Remito> getRemitos() {
        return this.remitos;
    }

    public void setRemitos(ArrayList<Remito> remitos) {
        this.remitos = remitos;
    }

    public EstadoPedido getEstadoPedido() {
        return this.estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void agregarArticulo (Pedido estePedido, Articulo articulo) throws Exception{
        this.estadoPedido.agregarArticulo(this, articulo);
    }

    public void agregarRemito (Pedido estePedido, Remito remito) throws Exception{
        this.estadoPedido.agregarRemito(this,remito);
    }
    
}
