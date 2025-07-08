// KOMMUNIKATION ZWISCHEN MODEL UND VIEW (PROGRAMMABLAUF)
package controller;

import models.PotenzModel;
import views.PotenzView;

public class PotenzController {

    private PotenzView view;
    private PotenzModel model;

    //KONSTRUKTOR
    public PotenzController() {
        this.view = new PotenzView();
        this.model = new PotenzModel();
        startProgramm();
    }

    public void startProgramm() {
        model.setBasis(view.readBasis());
        view.showPotenz(model.getPotenz());
    }

    // UM nochMal() AN DIE START.JAVA ZU SCHICKEN
    public boolean nochMal() {
        return view.nochMal();
    }

}
