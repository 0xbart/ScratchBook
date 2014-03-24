package nl.hsleiden.exercise_1.listeners;

import nl.hsleiden.exercise_1.validation.Validator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Bart on 18-3-14.
 */
public class EventTextfieldsListener extends JPanel implements KeyListener {

    protected Validator validator = null;

    public EventTextfieldsListener(Validator v)
    {
        validator = v;
    }

    public EventTextfieldsListener() {}

    @Override
    public void keyTyped(KeyEvent e) {
        // Key Typed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Key Pressed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Key Released

        JComponent source = (JComponent) e.getSource();

        if(source instanceof JTextField)
        {
            JTextField textField = (JTextField) source;

            System.out.println(textField.getText());

            if(validator != null)
            {
                boolean isValid = validator.validate(textField.getText());

                if(!isValid)
                {
                    System.out.println(validator.getMessage());
                    JOptionPane.showMessageDialog(this, validator.getMessage());
                }
            }
        }
    }
}
