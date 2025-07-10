// KOMMUNIKATION ZWISCHEN MODEL UND VIEW (PROGRAMMABLAUF)
package controller;

import models.PotenzModel;
import views.GUIView;

import java.awt.*;

public class PotenzController {

    private GUIView view;
    private PotenzModel model;

    //KONSTRUKTOR
    public PotenzController() {
        this.view = new GUIView("Potenzrechner", this);            //ERSTELLEN VON GUI
        this.model = new PotenzModel();
    }

    //METHODE aktualisiereWerte()
    public void aktualisiereWerte(String inputName) {

        try {

            switch(inputName) {
                case "basisInput":
                    model.setBasis(Double.parseDouble(view.getBasisInput().getText().replace(',', '.')));
                    view.setPotenzInput(model.getPotenz());
                    break;
                case "potenzInput":
                    model.setPotenz(Double.parseDouble(view.getPotenzInput().getText().replace(',', '.')));
                    view.setBasisInput(model.getBasis());
                    break;
                default:
                    return;
            }
            toggleError(inputName,false); //FEHLERNACHRICHT AUSBLENDEN

        } catch (NumberFormatException e) {

            toggleError(inputName,true); //FEHLERNACHRICHT EINBLENDEN

        }

    }

    private void toggleError(String inputName, boolean on) {

        if (on) {

            if (inputName.equals("basisInput")) {
                view.getBasisInput().setForeground(Color.RED);
                view.getBasisInput().setBackground(new Color(255, 175, 150));
            } else {
                view.getPotenzInput().setForeground(Color.RED);
                view.getPotenzInput().setBackground(new Color(255, 175, 150));
            }
            view.getErrorMessage().setVisible(true);

        } else {

            if (inputName.equals("basisInput")) {
                view.getBasisInput().setForeground(Color.BLACK);
                view.getBasisInput().setBackground(Color.WHITE);
            } else {
                view.getPotenzInput().setForeground(Color.BLACK);
                view.getPotenzInput().setBackground(Color.WHITE);
            }
            view.getErrorMessage().setVisible(false);

        }

    }

}
