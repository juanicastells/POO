package com.juan;

public class PayPal implements formaPago{
    private String nombreUsuario;

    public PayPal() {
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void pagar() {
        System.out.println("Datos de la venta: "+ nombreUsuario);
    }

}
