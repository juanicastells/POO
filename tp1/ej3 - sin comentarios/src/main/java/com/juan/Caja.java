package com.juan; 

public class Caja extends Producto {
    private int unidades;
    private double precioCaja;
    

    public Caja() {
        unidades = 0;
        precioCaja = 0;
    }


    public int getUnidades() {
        return this.unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioCaja() {
        return this.precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }

    public double precio(){
        return getPrecioCaja();
    }
}
