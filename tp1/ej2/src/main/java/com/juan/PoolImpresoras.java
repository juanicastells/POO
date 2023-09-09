package com.juan;
import java.util.ArrayList;

public class PoolImpresoras {
    private static ArrayList <Impresora> impresoras;
    private static PoolImpresoras poolImpresoras; 

    private PoolImpresoras (){
        impresoras = new ArrayList<Impresora>();
    }

    public static PoolImpresoras getPoolImpresoras() {
        if (poolImpresoras == null){
            poolImpresoras = new PoolImpresoras();
        }
        return poolImpresoras;
    }
    

}
