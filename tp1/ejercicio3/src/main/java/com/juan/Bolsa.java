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

    /*No sabemos si el descuento se aplica al total de cajas o 
    a las sub bolsas y finalmente a la bolsa contenedora*/
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
 

    /*Explicacion: 
     * 
     *  Cada llamada recursiva crea una nueva variable precioFinal para calcular 
     * el precio total de la bolsa actual y sus productos.
     * 
     * Dado que se crea una nueva variable precioFinal en cada llamada recursiva, 
     * cada llamada tiene su propia copia de esta variable, por lo que el valor de precioFinal 
     * en llamadas anteriores no se modifica. Esto permite calcular el precio total de la bolsa 
     * actual y sus productos sin que el valor de precioFinal se mezcle o se vea afectado por 
     * llamadas recursivas anteriores.
     * 
     * seria así:
     * precioFinal1 = 900. Luego a precioFinal1 (900) hay que sumarle p.precio pero de la bolsa
     * entonces precioFinal1 = 900 + p.precio() (de la bolsa)
     * como p.precio () de bolsa inicializa otro precioFinal2 
     * luego precioFinal2 = (1700 + 2000) / 1.1 = 3363 que es retornado hacia el punto donde
     * habíamos quedado es decir, 900 + p.precio = 900 + 3363 = 4.263.
     * Luego se finaliza la primer llamada a p.precio retornando 4.263 / 1.1.  
    */
    
}
