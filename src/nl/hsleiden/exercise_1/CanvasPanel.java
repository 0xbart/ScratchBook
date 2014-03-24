package nl.hsleiden.exercise_1;

import nl.hsleiden.exercise_1.listeners.EventTextfieldsListener;
import nl.hsleiden.exercise_1.listeners.SaveBinaryButtonListener;
import nl.hsleiden.exercise_1.listeners.SaveTxtButtonListener;
import nl.hsleiden.exercise_1.validation.PhoneNumberValidator;
import nl.hsleiden.exercise_1.validation.PlainTextValidator;
import nl.hsleiden.exercise_1.validation.SmallPlainTextValidator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bart on 17-3-14.
 */
public class CanvasPanel extends JPanel {

    //create labels
    public JLabel jlAchternaam = new JLabel(" Achternaam:"),
                     jlTussenvoegsel = new JLabel(" Tussenvoegsel:"),
                     jlVoornaam = new JLabel(" Voornaam:"),
                     jlVoorletters = new JLabel(" Voorletters:"),
                     jlGeslacht = new JLabel(" Geslacht:"),
                     jlGeboortedatum = new JLabel(" Geboortedatum:"),
                     jlAdres = new JLabel(" Adres:"),
                     jlPostcode = new JLabel(" Postcode:"),
                     jlWoonplaats = new JLabel(" Woonplaats:"),
                     jlTelefoonnummer = new JLabel(" Telefoonnummer:"),
                     jlMobiel = new JLabel(" Mobiel:"),
                     jlEmail = new JLabel(" E-mail adres:"),
                     jlFileName = new JLabel(" Bestandsnaam:");

    //create textfields
    public JTextField jtAchternaam = new JTextField(),
                         jtTussenvoegsel = new JTextField(),
                         jtVoornaam = new JTextField(),
                         jtVoorletters = new JTextField(),
                         jtGeslacht = new JTextField(),
                         jtGeboortedatum = new JTextField(),
                         jtAdres = new JTextField(),
                         jtPostcode = new JTextField(),
                         jtWoonplaats = new JTextField(),
                         jtTelefoonnummer = new JTextField(),
                         jtMobiel = new JTextField(),
                         jtEmail = new JTextField(),
                         jtFileName = new JTextField();

    //create buttons
    protected JButton jbSaveBin = new JButton("Save as Binair file"),
                      jbSaveTxt = new JButton("Save as TXT file");

    public JTextField getJtAchternaam() {
        return jtAchternaam;
    }

    public JTextField getJtTussenvoegsel() {
        return jtTussenvoegsel;
    }

    public JTextField getJtVoornaam() {
        return jtVoornaam;
    }

    public JTextField getJtVoorletters() {
        return jtVoorletters;
    }

    public JTextField getJtGeslacht() {
        return jtGeslacht;
    }

    public JTextField getJtGeboortedatum() {
        return jtGeboortedatum;
    }

    public JTextField getJtAdres() {
        return jtAdres;
    }

    public JTextField getJtPostcode() {
        return jtPostcode;
    }

    public JTextField getJtWoonplaats() {
        return jtWoonplaats;
    }

    public JTextField getJtTelefoonnummer() {
        return jtTelefoonnummer;
    }

    public JTextField getJtMobiel() {
        return jtMobiel;
    }

    public JTextField getJtEmail() {
        return jtEmail;
    }

    public JTextField getJtFileName() {
        return jtFileName;
    }

    //constructor panel
    public CanvasPanel()
    {
        //create GridLayout
        this.setLayout(new GridLayout(14, 2));

        //add labels and textfields into Grid
        this.add(jlAchternaam);
        this.add(jtAchternaam);
        this.add(jlTussenvoegsel);
        this.add(jtTussenvoegsel);
        this.add(jlVoornaam);
        this.add(jtVoornaam);
        this.add(jlVoorletters);
        this.add(jtVoorletters);
        this.add(jlGeslacht);
        this.add(jtGeslacht);
        this.add(jlGeboortedatum);
        this.add(jtGeboortedatum);
        this.add(jlAdres);
        this.add(jtAdres);
        this.add(jlPostcode);
        this.add(jtPostcode);
        this.add(jlWoonplaats);
        this.add(jtWoonplaats);
        this.add(jlTelefoonnummer);
        this.add(jtTelefoonnummer);
        this.add(jlMobiel);
        this.add(jtMobiel);
        this.add(jlEmail);
        this.add(jtEmail);

        this.add(jlFileName);
        this.add(jtFileName);
        this.add(jbSaveTxt);
        this.add(jbSaveBin);

        //create eventlisteners textfields
        jtAchternaam.addKeyListener(new EventTextfieldsListener(new PlainTextValidator()));
        jtTussenvoegsel.addKeyListener(new EventTextfieldsListener(new SmallPlainTextValidator()));
        jtVoornaam.addKeyListener(new EventTextfieldsListener(new PlainTextValidator()));
        jtVoorletters.addKeyListener(new EventTextfieldsListener(new SmallPlainTextValidator()));
        jtGeslacht.addKeyListener(new EventTextfieldsListener(new SmallPlainTextValidator()));
        jtGeboortedatum.addKeyListener(new EventTextfieldsListener(new SmallPlainTextValidator()));
        jtAdres.addKeyListener(new EventTextfieldsListener(new PlainTextValidator()));
        jtPostcode.addKeyListener(new EventTextfieldsListener(new SmallPlainTextValidator()));
        jtWoonplaats.addKeyListener(new EventTextfieldsListener(new PlainTextValidator()));
        jtTelefoonnummer.addKeyListener(new EventTextfieldsListener(new PhoneNumberValidator()));
        jtMobiel.addKeyListener(new EventTextfieldsListener(new PhoneNumberValidator()));
        jtEmail.addKeyListener(new EventTextfieldsListener(new PhoneNumberValidator()));

        JTextField[] require =  {
                                    jtAchternaam, jtTussenvoegsel, jtVoornaam,
                                    jtVoorletters, jtGeslacht, jtGeboortedatum,
                                    jtAdres, jtPostcode, jtWoonplaats,
                                    jtTelefoonnummer, jtMobiel, jtEmail
                                };

        //create actionlisteners buttons
        jbSaveTxt.addActionListener(new SaveTxtButtonListener(this));
        jbSaveBin.addActionListener(new SaveBinaryButtonListener());
    }
}