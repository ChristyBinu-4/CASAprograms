package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HOTELDETAILS extends JFrame {
    private JPanel panelht;
    private JLabel label2;
    private JButton CLICKButton;
    private JLabel label3;
    private JButton CLICKButton1;
    private JLabel label5;
    private JButton CLICKButton2;
    private JButton CLICKButton3;
    private JLabel lab1;
    private JLabel LLBB;
    private JButton backButton;

    public HOTELDETAILS () {

        CLICKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LISTOFCUSTOMERS();

            }
        });
        CLICKButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VACANTROOMS ();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ADMINLOGIN();
                setVisible(false);
            }
        });
        CLICKButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new LISTOFSERVICES();
            }
        });
        CLICKButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new totalbill();
            }
        });
    }

        public static void main(String args[]){
            HOTELDETAILS HP=new HOTELDETAILS();
        }
}
