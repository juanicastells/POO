package org.example;

public class Main {
    public static void main(String[] args) {

        Cuadrado prototipoCuadrado = new Cuadrado(2.5f);
        System.out.println("EL ESTADO DEL CLON ES EL MISMO QUE EL DEL PROTOTIPO");
        System.out.println(prototipoCuadrado.clonar().getLado());
    }

    /*Digamos que tienes un objeto y quieres crear una copia exacta de él.
    ¿Cómo lo harías? En primer lugar, debes crear un nuevo objeto de la misma clase.
    Después debes recorrer todos los campos del objeto original y copiar sus valores
    en el nuevo objeto.

    ¡Bien! Pero hay una trampa. No todos los objetos se pueden copiar de este modo, porque
    algunos de los campos del objeto pueden ser privados e invisibles desde fuera del
    propio objeto.*/
}