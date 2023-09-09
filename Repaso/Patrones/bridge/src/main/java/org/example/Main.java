package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*Digamos que tienes una clase geométrica Forma con un par de subclases: Círculo y Cuadrado.
Deseas extender esta jerarquía de clase para que incorpore colores, por lo que planeas
crear las subclases de forma Rojo y Azul. Sin embargo, como ya tienes dos subclases,
tienes que crear cuatro combinaciones de clase, como CírculoAzul y CuadradoRojo.

Añadir nuevos tipos de forma y color a la jerarquía hará que ésta crezca exponencialmente.
Por ejemplo, para añadir una forma de triángulo deberás introducir dos subclases,
una para cada color. Y, después, para añadir un nuevo color habrá que crear tres subclases,
una para cada tipo de forma. Cuanto más avancemos, peor será.

Este problema se presenta porque intentamos extender las clases de forma en dos dimensiones
independientes: por forma y por color. Es un problema muy habitual en la herencia de clases.

El patrón Bridge intenta resolver este problema pasando de la herencia a la composición
del objeto. Esto quiere decir que se extrae una de las dimensiones a una jerarquía
de clases separada, de modo que las clases originales referencian un objeto de la nueva
jerarquía, en lugar de tener todo su estado y sus funcionalidades dentro de una clase.

Con esta solución, podemos extraer el código relacionado con el color y colocarlo dentro
de su propia clase, con dos subclases: Rojo y Azul. La clase Forma obtiene entonces un
campo de referencia que apunta a uno de los objetos de color. Ahora la forma puede
delegar cualquier trabajo relacionado con el color al objeto de color vinculado.
Esa referencia actuará como un puente entre las clases Forma y Color.
En adelante, añadir nuevos colores no exigirá cambiar la jerarquía de forma y viceversa.*/