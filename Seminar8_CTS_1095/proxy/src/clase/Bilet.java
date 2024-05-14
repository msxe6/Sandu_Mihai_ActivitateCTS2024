package clase;

public class Bilet implements BiletAbstract{

    private String echipaGazda;
    private String echipaOaspete;
    private double pretBilet;

    public Bilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pretBilet = pretBilet;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public double getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void vanzareBilet(Client client) {
        System.out.println(client.getNume() + " a cumparat bilet la meciul " +
                this.echipaGazda + " - " + this.echipaOaspete +"!");
    }
}
