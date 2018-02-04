package edu.ithaca.agable;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        frame.getContentPane().add(panel);

        JButton button = new JButton("This is a button");
        panel.add(button);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,15));
        panel.add(textField);

        JButton button2 = new JButton("This button is so long it has to be added on the next line");
        panel.add(button2);

        //set frame size
        frame.setSize(new Dimension(500,400));
        //set start pos in center
        frame.setLocationRelativeTo(null);
        //set a default close action
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("A simple JFrame");
        //disable resize
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
