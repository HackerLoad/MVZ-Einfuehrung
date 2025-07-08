// ALLES WAS DER BENUTZER SIEHT WIRD HIER GESCHRIEBEN
package views;

import main.Helper;

public class PotenzView {

    // KONSTRUKTOR
    public PotenzView() {
        printHeader();
    }

    // FUNKTION printHeader()
    private void printHeader() {
        System.out.println(" Potenz berechnen ");
        System.out.println("==================\n");
    }

    public double readBasis() {
        System.out.println("Bitte geben Sie die Zahl, für die die Potenz berechnet werden soll ein.");
        System.out.print("Eingabe: ");
        return Helper.getDouble();
    }

    // showPotenz-METHODE
    public void showPotenz(double potenz) {
        System.out.println("Die Potenz ist " + potenz + ".");
    }

}
