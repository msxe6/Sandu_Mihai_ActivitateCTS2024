package dubluri;

import model.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sex;
    private int varsta;
    private boolean checkCNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return this.checkCNP;
    }
}
