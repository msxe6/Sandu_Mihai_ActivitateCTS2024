package bilete.clase;

public class Bilet extends BileteAbstract {

    public Bilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }

    @Override
    public void printareBilet(){
        System.out.println(this.toString());
    }
}
