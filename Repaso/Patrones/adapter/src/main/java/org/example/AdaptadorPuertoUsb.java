package org.example;

public class AdaptadorPuertoUsb implements AdaptarPuerto {
    private String pin1; //datos de cada pin
    private String pin2;
    private String pin3;
    private String pin4;
    private PuertoRj45 puertoRj45;
    public AdaptadorPuertoUsb() {
    }

    public String getPin1() {
        return pin1;
    }

    public void setPin1(String pin1) {
        this.pin1 = pin1;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public String getPin3() {
        return pin3;
    }

    public void setPin3(String pin3) {
        this.pin3 = pin3;
    }

    public String getPin4() {
        return pin4;
    }

    public void setPin4(String pin4) {
        this.pin4 = pin4;
    }

    public PuertoRj45 getPuertoRj45() {
        return puertoRj45;
    }

    public void setPuertoRj45(PuertoRj45 puertoRj45) {
        this.puertoRj45 = puertoRj45;
    }
    public void conectarARJ45 (){
        this.puertoRj45.setPin2(this.getPin1());
        this.puertoRj45.setPin4(this.getPin2());
        this.puertoRj45.setPin6(this.getPin3());
        this.puertoRj45.setPin8(this.getPin4());
    }
}
