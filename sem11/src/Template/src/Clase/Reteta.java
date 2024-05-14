package Template.src.Clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta{
    private int nrReteta;
    private List<String> listaMedicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        this.listaMedicamente = new ArrayList<>();

    }

    public int getNrReteta() {
        return nrReteta;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public void adaugareMedicament(String medicament) {
        this.listaMedicamente.add(medicament);
    }
}
