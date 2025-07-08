package main;

import controller.PotenzController;

public class Start {

    public static void main(String [] args) {
        PotenzController myController = new PotenzController();

        while(myController.nochMal())
            myController.startProgramm();
    }

}
