package org.example;

public class Cuadrado implements Figura{
    private float lado;
    public Cuadrado (float lado){
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public Cuadrado clonar (){
        return new Cuadrado(this.lado);
    }
    /*cada figura implementa el metodo clonar de la interfaz Figura y retorna un nuevo objeto
    con los valores del objeto prototipo */
}
