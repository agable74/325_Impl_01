package edu.ithaca.agable;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //set frame size
        frame.setSize(new Dimension(500,400));
        //set start pos in center
        frame.setLocationRelativeTo(null);
        //set a default close action
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("A simple JFrame");
        //disable resuze
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
