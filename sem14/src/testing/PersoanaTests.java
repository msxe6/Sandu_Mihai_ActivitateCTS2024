package testing;

import model.IPersoana;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testing.categorii.TesteErrorCondition;
import testing.categorii.TesteRange;

import static org.junit.Assert.*;

public class PersoanaTests {

    @org.junit.Test
    @Category(TesteRange.class)
    public void testGetSexMasculin() {
        IPersoana persoana1 = new Persoana("Florin", "5020202123456");
        assertEquals("M", persoana1.getSex());
    }
    @org.junit.Test
    @Category(TesteRange.class)
    public void testGetSexFeminin(){
        IPersoana persoana1 = new Persoana("Ramona", "2020202123456");
        assertEquals("F", persoana1.getSex());
    }

    @org.junit.Test
    @Category(TesteRange.class)
    public void testGetMinBoundaries(){
        IPersoana persoana1 = new Persoana("Florin", "1020202123456");
        assertEquals("M", persoana1.getSex());
    }
    @org.junit.Test
    @Category(TesteRange.class)
    public void testGetMaxBoundaries(){
        IPersoana persoana1 = new Persoana("Ramona", "6020202123456");
        assertEquals("F", persoana1.getSex());
    }
    @org.junit.Test
    public void testCrossCheck(){
        Persoana persoana1 = new Persoana("Ramona", "6020202123456");
      //obtin prima cifra
        int cifra= persoana1.CNP.charAt(0);
        //testez paritatea primei cifre
        //daca este para inseamna ca getSex return F
        //daca este impara inseamna ca getSex return
        String caracter=(cifra%2==0?"F":"M");
        assertEquals(caracter,persoana1.getSex());
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TesteErrorCondition.class)
    public void testError(){
        Persoana persoana1 = new Persoana("Ramona", "-020202123456");
      persoana1.getSex();

    }
    @Test(expected = IllegalArgumentException.class)
    @Category(TesteErrorCondition.class)
    public void testNoCnp(){
        Persoana persoana1 = new Persoana("Ramona", "");
        persoana1.getSex();
    }
    @Test(timeout = 50)
    public void testPerformanceGetSex(){
        Persoana persoana1 = new Persoana("Ramona", "6020202123456");
        persoana1.getSex();
    }
    @Test()
    public void testConformance(){
        Persoana persoana1 = new Persoana("Ramona", "6020202123456");
        String sex = persoana1.getSex();
        assertTrue("Test didnt run ", (sex == "F" || sex =="M"));
    }
    @Test
    public void testOrderSex(){
        Persoana persoana1 = new Persoana("Ramona", "6020202123456");
        Persoana persoana2 = new Persoana("Andrei", "1020202123456");
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())<0);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(TesteErrorCondition.class)
    public void testGetSexExistence(){
        IPersoana persoana=new Persoana("Ramona", null);
        persoana.getSex();
    }

}