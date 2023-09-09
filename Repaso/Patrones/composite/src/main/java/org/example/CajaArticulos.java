package org.example;

import java.util.Vector;

public class CajaArticulos extends Componente {
    private Vector <Componente> componentes;
    public CajaArticulos() {
        componentes = new Vector<Componente>();
    }

    public void agregarComponente (Componente componente){
        componentes.add (componente);
    }
    public int cantidadComponentes (){
        return componentes.size();
    }
}
