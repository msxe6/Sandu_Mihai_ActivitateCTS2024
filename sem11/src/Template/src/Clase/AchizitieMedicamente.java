package Template.src.Clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {
    Map<String, Integer> stoc;

    public AchizitieMedicamente() {
        this.stoc = new HashMap<>();
        stoc.put("Paracetamol", 20);
        stoc.put("Nurofen", 26);
        stoc.put("Aspirina", 12);

    }

    public final void achizitioneazaMedicamente(){
        primesteReteta();
        if(verificaStoc()){
            aducereMedicamente();
            incaseaza();
            emitereBon();
        }
        else {
            respingeAchizitie();
        }

    }

    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emitereBon();
    public abstract void respingeAchizitie();

}
