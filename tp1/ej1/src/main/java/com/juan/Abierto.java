package com.juan;

public class Abierto extends EstadoPedido {

    public Abierto() {
    }

    public void agregarArticulo (Pedido pedido, Articulo articulo){
        pedido.getArticulos().add(articulo);
    }

    public void agregarRemito (Pedido pedido, Remito remito) throws ExcepcionAbierto{
        throw new ExcepcionAbierto();
    }
    
}
