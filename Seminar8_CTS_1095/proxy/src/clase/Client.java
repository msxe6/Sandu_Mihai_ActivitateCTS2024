package clase;

public class Client {
    private int varsta;
    private String nume;

    public Client( String nume,int varsta) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
