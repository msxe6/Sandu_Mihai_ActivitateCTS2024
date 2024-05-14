package bilete.clase;

public abstract class BileteAbstract {
    String echipaGazda;
    String echipaOaspete;
    double pretBilet;

    public BileteAbstract(String echipaGazda, String echipaOaspete, double pretBilet) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pretBilet = pretBilet;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public double getPretBilet() {
        return pretBilet;
    }

    @Override
    public String toString() {
        return "BileteAbstract{" +
                "echipaGazda='" + echipaGazda + '\'' +
                ", echipaOaspete='" + echipaOaspete + '\'' +
                ", pretBilet=" + pretBilet +
                '}';
    }

    public abstract void printareBilet();
}
