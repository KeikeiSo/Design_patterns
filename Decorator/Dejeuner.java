package Decorator;

public class Dejeuner {
    private Repas aPlatPrincipal;
    private String aTypeDeBoisson;

    public Dejeuner(Repas pPlatPrincipal, String pTypeDeBoisson){
        aPlatPrincipal = pPlatPrincipal;
        aTypeDeBoisson = pTypeDeBoisson;
    }

    public Repas getPlatPrincipal(){
        return aPlatPrincipal;
    }

    public String getTypeDeBoisson(){
        return aTypeDeBoisson;
    }
}
