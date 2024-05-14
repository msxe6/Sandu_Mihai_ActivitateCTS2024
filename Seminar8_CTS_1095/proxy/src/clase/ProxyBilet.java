package clase;

public class ProxyBilet implements BiletAbstract{
    private BiletAbstract bilet;
    private int varstaMinima=16;

    public ProxyBilet(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta() >= varstaMinima){
            this.bilet.vanzareBilet(client);
        } else {
            System.out.println("Copiii cu varsta sub "+varstaMinima+" ani nu pot cumpara bilet!");
        }
    }
}
