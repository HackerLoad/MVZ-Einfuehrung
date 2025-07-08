// ALLES WAS DATEN BEINHALTET FINDET MAN HIER
package models;

public class PotenzModel {

    private double basis;
    private double potenz;

    // GETTER / SETTER
    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
        this.potenz = Math.pow(basis, 2);
    }

    public double getPotenz() {
        return potenz;
    }

    public void setPotenz(double potenz) {
        this.potenz = potenz;
        this.basis = Math.sqrt(potenz);
    }
}
