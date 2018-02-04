package edu.ithaca.agable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryClickMe extends JFrame{

    private JButton buttonCounter;
    private JButton buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public TryClickMe(){
        createView();

        setTitle("Click Me");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void createView(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,30));
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    clicks = 0;
                    updateCounter();
                }
            }
        );
        panel.add(buttonReset);


    }
    private void updateCounter(){
        labelCount.setText("Clicked " + clicks + " times");
    }

    private class ButtonCounterActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            clicks++;
            updateCounter();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
             @Override
             public void run(){
               new TryClickMe().setVisible(true);
            }
        });
    }
}
