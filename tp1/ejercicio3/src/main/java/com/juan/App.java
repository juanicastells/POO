package com.juan;

public class App 
{
    public static void main( String[] args )
    {
        Caja c1 = new Caja ();
        c1.setPrecioCaja(1700);
        
        Caja c2 = new Caja ();
        c2.setPrecioCaja(2000);

        Bolsa b1 = new Bolsa();
        b1.agregarProducto(c1);
        b1.agregarProducto(c2);

        Caja c3 = new Caja();
        c3.setPrecioCaja(900);

        Bolsa b2 = new Bolsa();
        b2.agregarProducto(c3);
        b2.agregarProducto(b1);

        System.out.println(b2.precio());
        System.out.println (b2.precioPromocional());
    }
}
