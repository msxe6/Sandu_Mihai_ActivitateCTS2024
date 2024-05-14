package bilete.decoratoare;

import bilete.clase.BileteAbstract;

public class BiletLocal extends DecoratorBilet{
    double valoareDiscount = 0.9;
    public BiletLocal(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }

    public double getValoareDiscount() {
        return valoareDiscount;
    }

    public void setValoareDiscount(double valoareDiscount) {
        this.valoareDiscount = valoareDiscount;
    }
    public BiletLocal(BileteAbstract bileteAbstract) {
        super(bileteAbstract);
    }

    @Override
    public void printareBilet(){
        this.printareBilet();
        System.out.println(this.getEchipaGazda());
    }

    public void aplicaDiscountBilet(){
        this.setPretBilet(this.getPretBilet()*valoareDiscount);
    }
}
