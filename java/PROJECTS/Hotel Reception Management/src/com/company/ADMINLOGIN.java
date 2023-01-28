package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADMINLOGIN extends JFrame {
    private JPanel Adpanel;
    private JLabel lbl1;
    private JLabel lbl2;
    private JButton CLICKButton;
    private JLabel lbl3;
    private JButton CLICKButton1;
    private JButton CLICKButton2;
    private JLabel lbl5;
    private JLabel lbl6;
    private JButton CLICKButton3;
    private JLabel hoteldetails;
    private JButton buttONhh;
    private JButton BACKButton;

    public ADMINLOGIN() {
        setContentPane(Adpanel);
        setTitle("WELCOMEPAGE");
        setSize(350, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        buttONhh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        HOTELDETAILS HP=new HOTELDETAILS();

            }
        });
        CLICKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NEW_EMPLOYEE_REGISTRATION();
            }
        });
        CLICKButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                         new CUSTOMERDETAILS();

            }
        });
        CLICKButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new REMOVEEMPLOYEE();
                setVisible(false);
            }
        });
        CLICKButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ADDNEWADMIN();
                setVisible(false);
            }
        });
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WELCOMEPAGE();
                setVisible(false);
            }
        });
    }

    public static void main(String args[]) {
        ADMINLOGIN AP = new ADMINLOGIN();
    }
}