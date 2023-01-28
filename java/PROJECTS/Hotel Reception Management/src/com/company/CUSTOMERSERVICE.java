package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CUSTOMERSERVICE extends JFrame {
    private JButton CUSTOMERSERVICEDATAButton;
    private JButton EMPLOYEESONSERVICEButton;
    private JButton NEWUPDATESButton;
    private JLabel LABEL1;
    private JPanel pan;
    private JButton ASSIGNSERVICEButton;
    private JButton SERVICEUPDATIONButton;
    private JButton backToHomePageButton;

    public CUSTOMERSERVICE(){
        setContentPane(pan);
        setTitle("CUSTOMER SERVICE");
        setSize(350, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        CUSTOMERSERVICEDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LISTOFSERVICES();
            }
        });

        EMPLOYEESONSERVICEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EMPLOYEEONSERVICE();
            }
        });
        ASSIGNSERVICEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ASSIGNSERVICE();
            }
        });
        SERVICEUPDATIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SERVICEUPDATION();
            }
        });
        backToHomePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WELCOMEPAGE();
                setVisible(false);
            }
        });
    }

    public static void main(String args[]){ CUSTOMERSERVICE cc = new CUSTOMERSERVICE(); }
}
