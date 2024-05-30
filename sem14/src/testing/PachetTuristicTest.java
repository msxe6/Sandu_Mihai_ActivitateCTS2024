package testing;

import dubluri.PersoanaFake;
import model.IPersoana;
import model.PachetTuristic;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testing.categorii.TesteRange;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {

    @Test
    @Category(TesteRange.class)
    public void corectAplicaDiscountVarstnici(){
        IPersoana persoana = new Persoana("florin", "1500101111111");
        PachetTuristic pachetTuristic = new PachetTuristic( persoana, "maldive", 100.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0 ,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void limitBoundaryAplicaDiscountVarstnici(){
        IPersoana persoana = new Persoana("florin", "1590101111111");
        PachetTuristic pachetTuristic = new PachetTuristic( persoana, "maldive", 200.00);
        pachetTuristic.aplicaDiscountVarstnici(55);
        assertEquals(90.0 ,pachetTuristic.getPret(),0.01);

    }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFakeNoDiscount(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic( persoana, "maldive", 200.00);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(200.0, pachetTuristic.getPret(), 0.01);
    }
}
