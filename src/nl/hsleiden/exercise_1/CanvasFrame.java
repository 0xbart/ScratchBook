package nl.hsleiden.exercise_1;

import javax.swing.*;

/**
 * Created by Bart on 17-3-14.
 */
public class CanvasFrame extends JFrame {
    public CanvasFrame()
    {
        //create frame - default properties
        this.setSize(300, 400);
        this.setTitle("Opdracht 1 HSLeiden");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        //add panel to frame
        this.add(new CanvasPanel());

        //set visible to show panel / frame
        this.setVisible(true);
    }
}
