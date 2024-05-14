package State.src.Clase;

public class Achizitionata implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this);
    }
}
