package com.juan;

public class Venta {
    private formaPago pago;
    private double importe;

    public Venta() {
    }


    public formaPago getPago() {
        return this.pago;
    }

    public void setPago(formaPago pago) {
        this.pago = pago;
    }


    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }


}
