package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOODDELIVERY extends JFrame{
    private JButton LISTOFFOODSButton;
    private JButton LISTOFORDERSButton;
    private JButton UPDATIONOFSTATUSButton;
    private JLabel LABBEL;
    private JPanel PAENL;
    private JButton backToHomePageButton;

    public FOODDELIVERY(){
        backToHomePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WELCOMEPAGE();
                setVisible(false);
            }
        });
        UPDATIONOFSTATUSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UPDATESTATUS();
            }
        });
        LISTOFFOODSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new listoffood();
            }
        });
    }

    public static void main(String args[]){FOODDELIVERY fd = new FOODDELIVERY();}
}
