package org.example;

public class Dolar {
    private static Dolar instanciaDolar;
    private double cotizacion;
    private Dolar (){
    }

    public double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public static Dolar getInstanciaDolar (){
        if (instanciaDolar == null){
            System.out.println("No hay instancia. Se crea una");
            instanciaDolar = new Dolar();
            return instanciaDolar;
        }
        System.out.println("Ya existe una instancia...");
        return instanciaDolar;
    }
}
