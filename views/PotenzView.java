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

    // showPotenz-METHODE (ZEIGT DIE POTENZ AN)
    public void showPotenz(double potenz) {
        System.out.println("Die Potenz ist " + potenz + ".");
    }

    // nochMal-METHODE (WIEDERHOLT DAS PROGRAMM)
    public boolean nochMal() {
        System.out.println("\nNoch eine Berechnung? (j/n)");
        char test = ' ';
        while(true) {
            test = Helper.getChar();
            if(test == 'j')
                return true;
            else if(test == 'n')
                return false;
            else {
                System.out.println("Bitte nur j / n.");
            }
        }
    }

}
