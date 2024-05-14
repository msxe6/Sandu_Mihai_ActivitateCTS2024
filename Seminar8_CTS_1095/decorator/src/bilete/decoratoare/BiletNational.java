package bilete.decoratoare;

import bilete.clase.BileteAbstract;

public class BiletNational extends DecoratorBilet{

    public double discountBilet=0.85;
    public BiletNational(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }
    public BiletNational(BileteAbstract bileteAbstract) {
        super(bileteAbstract);
    }

    @Override
    public void printareBilet() {
        System.out.println();
    }

    @Override
    public void aplicaDiscountBilet(){
        this.setPretBilet(this.getPretBilet()*discountBilet);
    }

}
