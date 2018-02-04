package edu.ithaca.agable;


import javax.swing.*;
import java.awt.*;

public class myNewGUI extends JFrame {

    private JButton regular;
    private JButton custom;

    public myNewGUI(){
        super("The title");
        setLayout(new FlowLayout());

        regular = new JButton("Regular");
        add(regular);


    }
}
