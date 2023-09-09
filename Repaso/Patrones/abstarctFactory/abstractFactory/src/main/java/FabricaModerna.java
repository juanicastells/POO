public class FabricaModerna implements FabricaMuebles {

    private SillaModerna silla;
    private SofaModerno sofa;
    private MesillaModerna mesilla;

    public FabricaModerna (){
        silla = crearSilla();
        sofa = crearSofa();
        mesilla = crearMesilla();
    }
    public SillaModerna crearSilla (){
        return new SillaModerna();
    }

    public SofaModerno crearSofa (){
        return new SofaModerno();
    }
    public MesillaModerna crearMesilla(){
        return new MesillaModerna();
    }
}
