package com.juan;

/**
El Patrón a aplicar es el Strategy
 */
public class App 
{
    public static void main( String[] args )
    {
        Venta v1 = new Venta();
        PayPal p1 = new PayPal();
        p1.setNombreUsuario("jcastells");
        v1.setPago(p1);
        System.out.println(v1.getPago().getNombreUsuario());
    }
}
