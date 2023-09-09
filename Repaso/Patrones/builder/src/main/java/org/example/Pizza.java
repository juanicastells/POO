package org.example;

public abstract class Pizza implements PrepararPizza {
    private Masa masa;
    private String salsa;
    private String queso;
    private String ingrediente;
    private String aceitunas;

    public Pizza (){
        prepararMasa();
    }
    public Masa getMasa() {
        return masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getAceitunas() {
        return aceitunas;
    }

    public void setAceitunas(String aceitunas) {
        this.aceitunas = aceitunas;
    }

    public void prepararMasa (){
        masa = new Masa();
    }
}
