package State.src.Clase;

public class Solicitata implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this);
    }
}
