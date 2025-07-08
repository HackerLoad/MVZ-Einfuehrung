package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {

    private static Scanner scan = new Scanner(System.in);

    public static double getDouble() {
        while(true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Nur Zahlen, Punkt als Dezimalzeichen!");
                scan.nextLine();
            }
        }
    }

}