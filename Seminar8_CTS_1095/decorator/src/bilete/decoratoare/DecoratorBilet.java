package bilete.decoratoare;

import bilete.clase.Bilet;
import bilete.clase.BileteAbstract;

public abstract class DecoratorBilet extends BileteAbstract {

    private BileteAbstract bileteAbstract;

    public DecoratorBilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
        this.bileteAbstract = new Bilet(echipaGazda,echipaOaspete,10);
    }

    public DecoratorBilet(BileteAbstract bileteDecorat){
        super(bileteDecorat.getEchipaGazda(), bileteDecorat.getEchipaOaspete(), bileteDecorat.getPretBilet());
    }

    public abstract void printareBilet();
    public abstract void aplicaDiscountBilet();
}
