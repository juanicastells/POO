package com.juan;

public class Entregado extends EstadoPedido{
    public Entregado() {
    }

    public void agregarArticulo (Pedido pedido, Articulo articulo) throws ExcepcionEntregado{
        throw new ExcepcionEntregado();
    }

    public void agregarRemito (Pedido pedido, Remito remito)throws ExcepcionEntregado{
        throw new ExcepcionEntregado();
    }
   
}
