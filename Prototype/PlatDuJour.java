package Prototype;

import java.util.EnumMap;

public class PlatDuJour {
    public static final Repas NULLREPAS = getNullRepas();
    private EnumMap<Jour, Repas> aPlatDuJour = new EnumMap<Jour, Repas>(Jour.class);
    private Repas aPrototype = NULLREPAS;


    private static Repas getNullRepas(){
        return new Repas(){
            @Override
            public int getPrice() {return 0;}
            @Override
            public Repas clone(){return getNullRepas();}
        };
    }
    public PlatDuJour(){
        initialize();
    }

    public void setPrototype(Repas pPrototype){
        aPrototype = pPrototype;
    }

    public void initialize(){
        for (Jour day : Jour.values()){
            aPlatDuJour.put(day, aPrototype.clone());
        }
    }

}
