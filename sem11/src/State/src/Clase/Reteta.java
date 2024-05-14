package State.src.Clase;

public class Reteta{
    private int nrReteta;
    private int nrMedicamente;
    private State stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicament(){
        if(this.stare instanceof Emisa){
            System.out.println("Reteta cu numarul " + this.nrReteta
                    + " a fost solicitata!");
            //this.stare = new Solicitata();

            //alta varianta
            State solicitata = new Solicitata();
            solicitata.schimbaStarea(this);
        }
        else {
            System.out.println("Aceasta reteta ("+"numarul "+ this.nrReteta
                    +") nu poate fi solicitata sau nu a fost inca emisa!");
        }
    }

    public void cumpararaMedicament() {
        if (this.stare instanceof Solicitata) {
            System.out.println("Reteta cu numarul " + this.nrReteta
                    + " a fost achizitionata!");
            State achizitionata = new Achizitionata();
            achizitionata.schimbaStarea(this);
        }
        else {
            System.out.println("Aceasta reteta ("+"numarul "+ this.nrReteta
                    +") nu poate fi achizitionata sau nu a fost inca emisa!");
        }
    }

    public void respingeAchizitie(){
        if (this.stare instanceof Solicitata) {
            System.out.println("Reteta cu numarul " + this.nrReteta
                    + " a fost respinsa! Ne pare rau!");
            State emisa = new Emisa();
            emisa.schimbaStarea(this);
        }
        else {
            System.out.println("Aceasta reteta ("+"numarul "+ this.nrReteta
                    +") nu poate fi respinsa!");
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", nrMedicamente=" + nrMedicamente +
                ", stare=" + stare +
                '}';
    }
}
