package com.juan;

import java.util.ArrayList;

public class Bolsa extends Producto{
    private ArrayList <Producto> productos; 
    
    public Bolsa() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto (Producto producto){
        productos.add (producto);
    }

  
    public double precio (){
        double precioFinal = 0;
        for (Producto p: productos){
            precioFinal += p.precio();
        }
        return precioFinal;
    }

    public double precioPromocional (){
         return this.precio()/1.1;
    }
 
}
