package org.example;

public class Main {
    public static void main(String[] args) {
        PuertoRj45 puertoRj45 = new PuertoRj45();
        AdaptadorPuertoUsb puertoUsb = new AdaptadorPuertoUsb();
        puertoUsb.setPuertoRj45(puertoRj45);
        puertoUsb.setPin1("0");
        puertoUsb.setPin2("1");
        puertoUsb.setPin3("0");
        puertoUsb.setPin4("1");
        puertoUsb.conectarARJ45();
        System.out.println("los datos del usb salen por los pines:");
        System.out.println("1: " + puertoRj45.getPin1());
        System.out.println("2: " + puertoRj45.getPin2());
        System.out.println("3: " + puertoRj45.getPin3());
        System.out.println("4: " + puertoRj45.getPin4());
        System.out.println("5: " + puertoRj45.getPin5());
        System.out.println("6: " + puertoRj45.getPin6());
        System.out.println("7: " + puertoRj45.getPin7());
        System.out.println("8: " + puertoRj45.getPin8());
        System.out.println("del puerto RJ45");
    }
}

/*Adapter es un patrón de diseño estructural
que permite la colaboración entre objetos con interfaces incompatibles.

En el ejemplo se simulará un adaptador USB a RJ45. Suponemos que queremos transmitir
por USB hacia un RJ45 (solo en esa dirección) que sería la interfaz incompatible*/