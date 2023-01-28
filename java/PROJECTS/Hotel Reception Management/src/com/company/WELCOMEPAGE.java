package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WELCOMEPAGE extends JFrame {
    private JLabel label11;
    private JLabel label12;
    private JButton CLICKButton;
    private JLabel label13;
    private JButton CLICKButton1;
    private JPanel jpanel11;
    private JButton CLICKButton2;

    public WELCOMEPAGE() {
        setContentPane(jpanel11);
        setTitle("WELCOMEPAGE");
        setSize(250,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        CLICKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ADMINENTER();
                setVisible(false);
            }
        });
        CLICKButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EMPLOYEELOGIN EL=new EMPLOYEELOGIN();
                setVisible(false);
            }
        });


    }
    public static void main(String args[]){
        WELCOMEPAGE WP=new WELCOMEPAGE();
    }
}

