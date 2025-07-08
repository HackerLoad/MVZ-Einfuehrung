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

    private void startProgramm() {
        model.setBasis(view.readBasis());
        view.showPotenz(model.getPotenz());
    }

}
