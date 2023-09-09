package org.example;

public class Circulo implements Figura{
    private float radio;
    public Circulo (float radio){
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public Circulo clonar (){
        return new Circulo(this.radio);
    }

    /*cada figura implementa el metodo clonar de la interfaz Figura y retorna un nuevo objeto
    con los valores del objeto prototipo */
}
