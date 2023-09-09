package org.example;

public class Main {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("Martillo");
        Articulo a2 = new Articulo("serrucho");
        Articulo a3 = new Articulo("cinta metrica");
        CajaArticulos c1 = new CajaArticulos();
        CajaArticulos c2 = new CajaArticulos();

        c1.agregarComponente(a1);
        c2.agregarComponente(a2);
        c2.agregarComponente(a3);
        c1.agregarComponente(c2);

        System.out.println("cantidad de componentes de c1, (no de articulos) es: " + c1.cantidadComponentes());
    }
}