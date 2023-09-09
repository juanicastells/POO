package com.juan;

public class App 
{
    public static void main( String[] args )
    {
        PoolImpresoras p1 = PoolImpresoras.getPoolImpresoras();
        PoolImpresoras p2 = PoolImpresoras.getPoolImpresoras();
        System.out.println(p1);
        System.out.println(p2);

        
    }
}
