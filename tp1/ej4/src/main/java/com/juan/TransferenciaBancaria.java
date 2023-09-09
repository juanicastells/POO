package com.juan;

public class TransferenciaBancaria implements formaPago{
    private String cbu;


    public TransferenciaBancaria() {
    }


    public String getCbu() {
        return this.cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

}
