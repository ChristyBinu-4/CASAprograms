package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RECEPTION extends JFrame{
    private JPanel PAENL;
    private JButton LISTOFVACANTROOMSButton;
    private JButton NEWCUSTOMERREGISTRATIONButton;
    private JButton VACATINGPROCESSButton;
    private JLabel jlabb;
    private JButton CUSTOMERDETAILSButton;
    private JButton backToHomePageButton;

    public RECEPTION(){
        setContentPane(PAENL);
        setTitle("RECEPTION");
        setSize(350, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        LISTOFVACANTROOMSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VACANTROOMS ();
            }
        });
        CUSTOMERDETAILSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CUSTOMERDETAILS();
            }
        });
        NEWCUSTOMERREGISTRATIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NEWCUSTOMERREGISTRATION();
            }
        });
        backToHomePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new WELCOMEPAGE();
            }
        });
        VACATINGPROCESSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Vacatingprocess();
            }
        });
    }

    public static void main(String args[]){
        new RECEPTION();
    }

}
