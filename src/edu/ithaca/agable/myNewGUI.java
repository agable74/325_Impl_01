package edu.ithaca.agable;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myNewGUI extends JFrame {

    private JButton regular;
    private JButton custom;

    public myNewGUI(){
        super("The title");
        setLayout(new FlowLayout());

        regular = new JButton("Regular");
        add(regular);

        ImageIcon redButton = createImageIcon("edu/ithaca/agable/redButton.png","my red button");
        ImageIcon blueButton = createImageIcon("edu/ithaca/agable/blueButton.png","my blue button");
//        Icon blueButton = new ImageIcon(getClass().getResource("C:\\Users\\Alex\\Documents\\2017-2018\\SP2018\\325\\Impl_01\\src\\edu\\ithaca\\agable\\blueButton.png"));
//        Icon redButton = new ImageIcon(getClass().getResource("C:\\Users\\Alex\\Documents\\2017-2018\\SP2018\\325\\Impl_01\\src\\edu\\ithaca\\agable\\redButton.png"));
        custom = new JButton("Custom",blueButton);
        custom.setRolloverIcon(redButton);
        add(custom);

        HandlerClass handler = new HandlerClass();
        regular.addActionListener(handler);
        custom.addActionListener(handler);

    }

    protected ImageIcon createImageIcon(String path, String description){
        java.net.URL imgURL = getClass().getResource(path);
        if(imgURL!=null){
            return new ImageIcon(imgURL,description);
        }else{
            System.err.println("Couldn't find file: " +path);
            return null;
        }
    }

    private class HandlerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,String.format("%s",e.getActionCommand()));
        }
    }
}
