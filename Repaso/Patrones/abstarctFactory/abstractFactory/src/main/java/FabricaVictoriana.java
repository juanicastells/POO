public class FabricaVictoriana implements FabricaMuebles{

    private SillaVictoriana silla;
    private SofaVictoriano sofa;
    private MesillaVictoriana mesilla;

    public FabricaVictoriana (){
        silla = crearSilla();
        sofa = crearSofa();
        mesilla = crearMesilla();
    }
    public SillaVictoriana crearSilla (){
        return new SillaVictoriana();
    }

    public SofaVictoriano crearSofa (){
        return new SofaVictoriano();
    }

    public MesillaVictoriana crearMesilla(){
        return new MesillaVictoriana();
    }
}
