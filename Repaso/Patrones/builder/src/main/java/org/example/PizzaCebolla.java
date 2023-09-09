package org.example;

public class PizzaCebolla extends Pizza {

    public PizzaCebolla(){
        colocarIngredientes();
    }
    public void colocarIngredientes (){
        setSalsa("");
        setQueso("Mozarella");
        setAceitunas("Aceitunas Negras");
        setIngrediente("Cebollas");
    }
}
