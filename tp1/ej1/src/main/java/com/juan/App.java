package com.juan;

public class App 
{
    public static void main( String[] args )
    {
        Pedido p1 = new Pedido();
        Remito r1 = new Remito();
        try{
            p1.agregarRemito (p1, r1);
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
    }
}
