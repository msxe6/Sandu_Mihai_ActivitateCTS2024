package Template.src.Clase;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente{

    Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul " + reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for (String medicament : reteta.getListaMedicamente()){
            if (!super.stoc.containsKey(medicament)){
                System.out.println("Medicamentul " + medicament + " nu este in stoc!");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele din reteta cu numarul " + reteta.getNrReteta()
        + " au fost aduse!");
        for (String medicament : reteta.getListaMedicamente()){
            int stocDisponibil = super.stoc.get(medicament);
            super.stoc.replace(medicament, stocDisponibil-1);
        }
        // trebuie sa parcurgem mapul si vreun medicament are valoarea 0, trebuie scos din map
    }

    @Override
    public void incaseaza() {
        //afiseaza
    }

    @Override
    public void emitereBon() {
        //afiseaza
    }

    @Override
    public void respingeAchizitie() {
        //afiseaza
    }
}
