package com.juan;

import java.util.ArrayList;

public class Remito{

    private ArrayList <Articulo> articulos;

    public Remito() {
        articulos = new ArrayList<Articulo>();
    }


    public ArrayList<Articulo> getArticulos() {
        return this.articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

}