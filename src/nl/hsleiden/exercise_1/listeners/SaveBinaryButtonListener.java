package nl.hsleiden.exercise_1.listeners;

import nl.hsleiden.exercise_1.validation.Validator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bart on 18-3-14.
 */
public class SaveBinaryButtonListener implements ActionListener {

    protected Validator validator = null;

    public SaveBinaryButtonListener(Validator v)
    {
        validator = v;
    }

    public SaveBinaryButtonListener() { }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Klik op binary button");

        JComponent source = (JComponent) e.getSource();

        if(source instanceof JButton)
        {
            JButton jbutton = (JButton) source;

            System.out.println(jbutton.getText());
        }
    }
}
