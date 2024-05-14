package State.src.program;

import State.src.Clase.Reteta;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta(1234, 5);

        reteta1.cumpararaMedicament();

        reteta1.solicitaMedicament();
        reteta1.respingeAchizitie();

        reteta1.solicitaMedicament();
        reteta1.solicitaMedicament();
        reteta1.cumpararaMedicament();
    }
}