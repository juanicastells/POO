package org.example;

public class Main {
    public static void main(String[] args) {
        Mozarella mozarella = new Mozarella();
        System.out.println("Los Ingredientes de la Pizza de Mozarella son:");
        System.out.println(mozarella.getSalsa()+ "\n" + mozarella.getQueso() + "\n" + mozarella.getIngrediente() + "\n" + mozarella.getAceitunas());
        PizzaCebolla pizzaCebolla = new PizzaCebolla();
        System.out.println("Los Ingredientes de la Pizza de Cebolla son:");
        System.out.println(pizzaCebolla.getSalsa()+ "\n" + pizzaCebolla.getQueso() + "\n" + pizzaCebolla.getIngrediente() + "\n" + pizzaCebolla.getAceitunas());
    }
}

/*El patrón de diseño Builder se utiliza para crear objetos complejos paso a paso,
separando la construcción del objeto final de su representación. Esto permite que el
mismo proceso de construcción pueda crear diferentes representaciones del mismo objeto.
Aqui se ilustra un ejemplo de cómo se podría implementar el patrón de
diseño Builder para construir un objeto "Pizza" y sus variedades:*/