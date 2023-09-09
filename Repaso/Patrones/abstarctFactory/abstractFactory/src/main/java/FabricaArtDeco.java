public class FabricaArtDeco implements FabricaMuebles{

    private SillaArtDeco silla;
    private SofaArtDeco sofa;
    private MesillaArtDeco mesilla;

    public FabricaArtDeco (){
        silla = crearSilla();
        sofa = crearSofa();
        mesilla = crearMesilla();
    }
    public SillaArtDeco crearSilla (){
        return new SillaArtDeco();
    }

    public SofaArtDeco crearSofa (){
        return new SofaArtDeco();
    }

    public MesillaArtDeco crearMesilla(){
        return new MesillaArtDeco();
    }
}
