package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASSIGNSERVICE extends JFrame{
    private JPanel JPAN;
    private JLabel LAB1;
    private JButton FORFOODDELIVERYButton;
    private JButton ANOTHERSERVICESButton;
    private JButton backButton;


    public ASSIGNSERVICE()
    {
        setContentPane(JPAN);
        setTitle("ASSIGN SERVICE");
        setSize(350, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        ANOTHERSERVICESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OTHERSERVICES();
            }
        });
        FORFOODDELIVERYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ASFOODSERVICE();
            }
        });
    }

    public static void main(String args[])
    {
        new ASSIGNSERVICE();
    }

}
