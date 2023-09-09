public class Cliente {
    private FabricaMuebles fabrica;

    public Cliente (FabricaMuebles fabrica){
        this.fabrica = fabrica;
    }
    public Silla crearSilla (){
        return fabrica.crearSilla();
    }
    public Sofa crearSofa (){
        return fabrica.crearSofa();
    }
    public Mesilla crearMesilla (){
        return fabrica.crearMesilla();
    }
}
