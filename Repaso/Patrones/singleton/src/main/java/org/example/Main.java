package org.example;

public class Main {
    public static void main(String[] args) {

        Dolar dolar1 = Dolar.getInstanciaDolar();
        Dolar dolar2 = Dolar.getInstanciaDolar();
        dolar1.setCotizacion(730);
        System.out.println("dolar1 y dolar2 son la misma instancia ambos nombres apuntan o refenrecian a la misma instancia");
        System.out.println(dolar1);
        System.out.println(dolar2);
        System.out.println("Al cambiar la cotizacion de uno cambia la del otro o mejor dicho solo cambia una cotizacion que es la de la unica instancia");
        dolar1.setCotizacion(730);
        System.out.println(dolar1.getCotizacion());
        System.out.println(dolar2.getCotizacion());
    }
}

/*Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una
clase tenga una única instancia, a la vez que proporciona un punto de acceso global a
dicha instancia.

El patrón Singleton resuelve dos problemas al mismo tiempo:

1. Garantizar que una clase tenga una única instancia.

Proporcionar un punto de acceso global a dicha instancia.

Solución
Todas las implementaciones del patrón Singleton tienen estos dos pasos en común:

Hacer privado el constructor por defecto para evitar que otros objetos utilicen el operador
new con la clase Singleton. Crear un método de creación estático que actúe como constructor.
Tras bambalinas, este método invoca al constructor privado para crear un objeto y lo guarda
en un campo estático. Las siguientes llamadas a este método devuelven el objeto almacenado
en caché.

Las variables y métodos estáticos en Java sirven para que puedan ser accedidos desde
cualquier parte del código (inclusive desde otras clases) sin tener que crear un objeto.
Un ejemplo muy común en donde se puede utilizar variables estáticas es cuando se necesita
definir una configuración global en un proyecto.

Como no hace falta accederlas desde un objeto, los métodos static se invocan con el
nombre de la clase seguido de un punto y el nombre del método.*/