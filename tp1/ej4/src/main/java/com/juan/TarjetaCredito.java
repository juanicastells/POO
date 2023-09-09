package com.juan;

public class TarjetaCredito implements formaPago {
    private String nombre;
    private String numeroTarjeta;
    private String digitosSeguridad;


    public TarjetaCredito() {
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getDigitosSeguridad() {
        return this.digitosSeguridad;
    }

    public void setDigitosSeguridad(String digitosSeguridad) {
        this.digitosSeguridad = digitosSeguridad;
    }

    public void pagar(){
        getDigitosSeguridad();
        getNombre();
        getNumeroTarjeta();
    }
}
