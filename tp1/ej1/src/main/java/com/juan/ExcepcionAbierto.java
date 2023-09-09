package com.juan;

public class ExcepcionAbierto extends Exception{

    public ExcepcionAbierto() {
    }

    public String getMessage (){
        return "No se pueden agregar Remitos. El pedido está abierto";
    }

}