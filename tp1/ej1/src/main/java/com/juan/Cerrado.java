package com.juan;

public class Cerrado extends EstadoPedido {
    
    public Cerrado() {
    }

    public void agregarArticulo (Pedido pedido, Articulo articulo)throws ExcepcionCerrado{
        throw new ExcepcionCerrado();
    }

    public void agregarRemito (Pedido pedido, Remito remito){
        pedido.getRemitos().add(remito);
    }
}
