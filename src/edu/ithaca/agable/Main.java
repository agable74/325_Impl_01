package edu.ithaca.agable;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{


    public Main() {
        JPanel panel = new JPanel();

        setTitle("Tutorial");

        setSize(640,480);
        setResizable(false);

        panel.setBackground(Color.DARK_GRAY);
        CustomButton button = new CustomButton("Customized");
        panel.add(button);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
