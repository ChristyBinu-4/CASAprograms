package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class OTHERSERVICES extends JFrame{
    private JPanel panel1;
    private JLabel OTHS;
    private JLabel SLR;
    private JComboBox comboBox1;
    private JLabel EMPA;
    private JComboBox comboBox2;
    private JCheckBox SWEEPINGCheckBox;
    private JCheckBox MOPPINGCheckBox;
    private JLabel SSSBD;
    private JLabel IFANY;
    private JTextPane textPane1;
    private JButton BACKButton;
    private JButton RESETButton;
    private JButton SUBMITButton;
    private JCheckBox ANYOTHERSERVICESCheckBox;
    PreparedStatement stmt;

    public OTHERSERVICES(){
        textPane1.setVisible(false);
        setContentPane(panel1);
        setTitle("CUSTOMER SERVICE");
        setSize(650, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        try {
            String sql = "select *  from customer_service where  STATUS = ' FREE'";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                comboBox1.addItem(rs.getString(1));

            }
        }
        catch (SQLException ep){
            ep.printStackTrace();
        }
        try {
            String sql1= "select *  from login  where TYPE = 'customer service' ";
            stmt = conn.prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                comboBox2.addItem(rs.getString(1));

            }
        }
        catch (SQLException ep){
            ep.printStackTrace();
        }

        ANYOTHERSERVICESCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  textPane1.setVisible(true);
            }
        });

        SUBMITButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String com = (String) comboBox1.getSelectedItem();
                String ja = (String) comboBox2.getSelectedItem();
                try {

                    String sql1 = "update customer_service set staffassigned = '" + ja + "' where ROOMNO =" + com + "";
                    stmt = conn.prepareStatement(sql1);
                    stmt.executeUpdate();

                } catch (SQLException ep) {
                    ep.printStackTrace();
                }
                String a = "";
                if (SWEEPINGCheckBox.isSelected()) {
                    try {
                        String sql3 = "update customer_service set STATUS = 'PROCEEDING', service =concat(service,'  Sweeping') , SERVICE_CHARGE = SERVICE_CHARGE +10 where ROOMNO =" + com + "";
                        stmt = conn.prepareStatement(sql3);
                        int rs = stmt.executeUpdate();
                        if (rs !=0 ) {
                            a = "OK1";
                        }
                    } catch (SQLException ep) {
                        ep.printStackTrace();
                    }
                }

                String b = "";
                if (MOPPINGCheckBox.isSelected()) {

                    try {

                        String sql4 = "update customer_service set STATUS = 'PROCEEDING', service =concat(service,'  MOPPING') , SERVICE_CHARGE = SERVICE_CHARGE +20 where ROOMNO =" + com + "";
                        stmt = conn.prepareStatement(sql4);
                        int rs = stmt.executeUpdate();
                        if (rs != 0) {
                            b = "OK";
                        }
                    } catch (SQLException ep) {
                        ep.printStackTrace();
                    }
                }
                String C = "";
                if (ANYOTHERSERVICESCheckBox.isSelected()) {
                    String s2 = textPane1.getText();
                    try {
                        String sql4 = "update customer_service set STATUS = 'PROCEEDING', service=concat" +
                                "(service,' "+ s2 +"') , SERVICE_CHARGE = SERVICE_CHARGE +20 where ROOMNO =" + com + "";
                        stmt = conn.prepareStatement(sql4);
                        int rs = stmt.executeUpdate();
                        if (rs !=0) {
                            C = "OK2";

                        }
                    } catch (SQLException ep) {
                        ep.printStackTrace();
                    }
                }
                System.out.println(a);
                System.out.println(b);
                System.out.println(C);

                if (a.equals("OK1") || b.equals("OK") || C.equals("OK2"))
                    JOptionPane.showMessageDialog(null,"service is being assigned");
            }
        });


        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OTHERSERVICES();
            }
        });


        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

}
