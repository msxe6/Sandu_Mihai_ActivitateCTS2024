package State.src.Clase;

public class Emisa implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this);
    }
}
