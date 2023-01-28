package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class NEWCUSTOMERREGISTRATION extends JFrame
{
    private JPanel panel1;
    private JLabel LAAB;
    private JComboBox comboBox1;
    private JLabel JLB1;
    private JLabel JLB2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextPane textPane1;
    private JSpinner spinner1;
    private JTextField textField3;
    private JButton SAVEButton;
    private JButton RESETButton;
    private JLabel JLB3;
    private JLabel JLB4;
    private JLabel JLB6;
    private JButton BACKButton;
    PreparedStatement stmt;

    public NEWCUSTOMERREGISTRATION(){
        setContentPane(panel1);
        setTitle("NEW EMPLOYEE REGISTRATION");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        try {
            String sql = "select ROOMNO from registration natural join customer_service where NO_OF_DAYS =0 and updates = 'no service needed'";
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

        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cb = (String) comboBox1.getSelectedItem();
                String name= textField1.getText();
                String phoneno= textField2.getText();
                String address= textPane1.getText();
                int  s  = (int) spinner1.getValue();
                String email= textField3.getText();

                String sql = "update registration set CUSTOMERID ='"+name+"' ,PHONENO="+phoneno+" ,address ='"+address+"', NO_OF_DAYS ="+s+",email ='"+email+"' where  ROOMNO ="+cb+"";
                try {
                    stmt = conn.prepareStatement(sql);
                    int a  = stmt.executeUpdate();
                    if (a!=0){
                        JOptionPane.showMessageDialog(null,"NEW CUSTOMER REGISTERED");
                        setVisible(false);
                        new NEWCUSTOMERREGISTRATION();
                    }
                    else
                        System.out.println("failed");
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NEWCUSTOMERREGISTRATION();
            }
        });
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new RECEPTION();
            }
        });
    }

    public static void main(String args[]) {
        NEWCUSTOMERREGISTRATION NER = new NEWCUSTOMERREGISTRATION();}
}
