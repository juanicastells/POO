package com.juan;

public class ExcepcionCerrado extends Exception{

    public ExcepcionCerrado() {
    }

    public String getMessage (){
        return "No se pueden agregar Artículos. El pedido está Cerrado";
    }

}