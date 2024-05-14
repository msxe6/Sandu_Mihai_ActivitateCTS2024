package Template.src.Main;

import Template.src.Clase.AchizitieMedicamente;
import Template.src.Clase.AchizitiePeBazaDeReteta;
import Template.src.Clase.Reteta;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Reteta r = new Reteta(1);
        r.adaugareMedicament("Paracetamol");
        r.adaugareMedicament("Fervex");

        AchizitieMedicamente a = new AchizitiePeBazaDeReteta(r);

        a.achizitioneazaMedicamente();
    }
}