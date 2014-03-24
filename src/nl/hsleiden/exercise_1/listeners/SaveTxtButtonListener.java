package nl.hsleiden.exercise_1.listeners;

import nl.hsleiden.exercise_1.CanvasPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 18-3-14.
 */
public class SaveTxtButtonListener implements ActionListener {

    private CanvasPanel canvasPanel;

    private String  sAchternaam,
                    sTussenvoegsel,
                    sVoornaam,
                    sVoorletters,
                    sGeslacht,
                    sGeboortedatum,
                    sAdres,
                    sPostcode,
                    sWoonplaats,
                    sTelefoonnummer,
                    sMobiel,
                    sEmail,
                    sFileName;

    public SaveTxtButtonListener(CanvasPanel jp) {
        canvasPanel = jp;
    }

    public String[] toArray() {
        return new String[] {
                sAchternaam,
                sTussenvoegsel,
                sVoornaam,
                sVoorletters,
                sGeslacht,
                sGeboortedatum,
                sAdres,
                sPostcode,
                sWoonplaats,
                sTelefoonnummer,
                sMobiel,
                sEmail,
                sFileName
        };
    }

    public void fillStrings()
    {
        sAchternaam = canvasPanel.getJtAchternaam().getText();
        sTussenvoegsel = canvasPanel.getJtTussenvoegsel().getText();
        sVoornaam = canvasPanel.getJtVoornaam().getText();
        sVoorletters = canvasPanel.getJtVoorletters().getText();
        sGeslacht = canvasPanel.getJtGeslacht().getText();
        sGeboortedatum = canvasPanel.getJtGeboortedatum().getText();
        sAdres = canvasPanel.getJtAdres().getText();
        sPostcode = canvasPanel.getJtPostcode().getText();
        sWoonplaats = canvasPanel.getJtWoonplaats().getText();
        sTelefoonnummer = canvasPanel.getJtTelefoonnummer().getText();
        sMobiel = canvasPanel.getJtMobiel().getText();
        sEmail = canvasPanel.getJtEmail().getText();
        sFileName = canvasPanel.getJtFileName().getText();
    }
    public boolean anyFieldEmpty()
    {
        for(String e : this.toArray())
            if(e == null || e.isEmpty()) return true;
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(canvasPanel != null)
        {
            fillStrings();
            if(anyFieldEmpty()) {
                JOptionPane.showMessageDialog(canvasPanel, "Vul alle velden in aub");
            } else {
                System.out.println("true");
            }
        }
    }
}
