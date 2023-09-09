package com.juan;

public class ExcepcionEntregado extends Exception{

    public ExcepcionEntregado() {
    }

    public String getMessage (){
        return "No se pueden agregar Articulos ni Remitos. El pedido está Entregado";
    }

}
