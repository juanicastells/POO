package com.juan;

public abstract class EstadoPedido{

    public abstract void agregarArticulo (Pedido pedido, Articulo articulo) throws Exception;

    public abstract void agregarRemito (Pedido pedido, Remito remito) throws Exception;

}