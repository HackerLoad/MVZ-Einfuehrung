package views;

import controller.PotenzController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIView extends JFrame {

    // KLASSEN
    private JLabel headerLabel;                 // ÜBERSCHRIFT
    private JLabel basisLabel;
    private JLabel potenzLabel;
    private JLabel errorMessage;

    private JTextField basisInput;              // EINGABE-BASIS
    private JTextField potenzInput;             // EINGABE-OUTPUT

    //KONSTRUKTOR
    public GUIView(String name, PotenzController controller) {
        super(name);    //ÜBERGABE AN MUTTI-KONSTRUKTOR

        headerLabel = new JLabel("Potenz (Berechnung)");
        basisLabel = new JLabel("Basis: ");
        potenzLabel = new JLabel("Potenz: ");

        //SCHRIFTART FÜR LABEL
        Font labelFont = new Font("Arial", 12, 20);
        headerLabel.setFont(new Font("Arial", 24, 30)); //SCHRIFTBEARBEITUNG (SCHRIFTART, DICKE, GRÖßE)
        basisLabel.setFont(labelFont);
        potenzLabel.setFont(labelFont);

        //FEHLERMELDUNG
        errorMessage = new JLabel("Eingabefehler, bitte überprüfen.");
        errorMessage.setFont(new Font("Comic Sans", 30, 20));
        errorMessage.setForeground(Color.red);
        errorMessage.setVisible(false);

        //TEXTFELD MIT MAX 10 ZEICHEN
        basisInput = new JTextField(10);
        potenzInput = new JTextField(10);
        basisInput.setName("basisInput");
        potenzInput.setName("potenzInput");

        //ACTION LISTENER
        ActionListener inputChangedAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField source = (JTextField) e.getSource();
                controller.aktualisiereWerte(source.getName());
            }
        };
        basisInput.addActionListener(inputChangedAction);
        potenzInput.addActionListener(inputChangedAction);

        //ERSTELLEN GRID
        setLayout(new GridBagLayout());
        GridBagConstraints co = new GridBagConstraints();

        co.gridx = 0;                               //ZEILE 0
        co.gridy = 0;                               //SPALTE 0
        co.gridwidth = 3;                           //BREITE SOLL ÜBER 2 SPALTEN GEHEN
        co.fill = GridBagConstraints.HORIZONTAL;    //FÜLLT HORIZONTALE
        co.anchor = GridBagConstraints.CENTER;      //ZENTRIERT ÜBERSCHRIFT
        add(headerLabel, co);                       //ERSTELLTE ELEMENTE WERDEN HINZUGEFÜGT

        // ABSTAND
        JLabel spacer1 = new JLabel(" ");
        spacer1.setFont(new Font("Arial", 12, 30));
        co.gridy = 1;
        add(spacer1, co);

        //BASIS-TEXT
        co.gridwidth = 1;
        co.gridy = 2;
        co.anchor = GridBagConstraints.WEST;
        add(basisLabel, co);

        //SPACER
        co.gridx = 1;
        add(new JLabel("    "), co);

        //POTENZ-TEXT
        co.gridx = 2;
        add(potenzLabel, co);

        //BASIS-EINGABE
        co.gridx = 0;
        co.gridy = 3;
        add(basisInput, co);

        //SPACER
        co.gridx = 1;
        add(new JLabel("        "), co);

        //POTENZ.INPUT
        co.gridx = 2;
        add(potenzInput, co);

        //FEHLERMELDUNG
        co.gridx = 0;
        co.gridy = 4;
        co.gridwidth = 0;
        co.fill = GridBagConstraints.HORIZONTAL;
        add(errorMessage, co);

        //GRÖßE & SICHTBARKEIT
        setSize(600, 300);
        setVisible(true);
    }

    //GETTER-Basis
    public JTextField getBasisInput() {
        return basisInput;
    }

    //SETTER-Basis
    public void setBasisInput(double basis) {
        this.basisInput.setText(Double.toString(basis));
    }

    //GETTER-Potenz
    public JTextField getPotenzInput() {
        return potenzInput;
    }

    //SETTER-Potenz
    public void setPotenzInput(double potenz) {
        this.potenzInput.setText(Double.toString(potenz));
    }

    //GETTER-FEHLERMELDUNG
    public JLabel getErrorMessage() {
        return this.errorMessage;
    }

}
