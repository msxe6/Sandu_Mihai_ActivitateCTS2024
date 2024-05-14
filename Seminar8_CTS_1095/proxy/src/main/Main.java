package main;

import clase.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1 = new Bilet("a","b",10.0);
        Client client1 = new Client("Popescu", 15);
        bilet1.vanzareBilet(client1);

        BiletAbstract bilet2 = new ProxyBilet(bilet1);
        bilet2.vanzareBilet(client1);

        Client client2 = new Client("Gogu", 18);


        BiletAbstract bilet3 = new ProxyBiletSector(bilet1);
        ProxyBiletSector.adaugareLitere('P');
        bilet3.vanzareBilet(client1);
        bilet3.vanzareBilet(client2);

        BiletAbstract bilet4 = new ProxyBilet(bilet3);
        bilet4.vanzareBilet(client1);
        bilet4.vanzareBilet(client2);
    }
}