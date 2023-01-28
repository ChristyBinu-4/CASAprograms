package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ADDNEWADMIN extends JFrame{
    private JPanel Jpanel11;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JLabel label6;
    private JPasswordField passwordField2;
    private JButton OKButton;
    private JButton RESETButton;
    private JTextPane textPane1;
    PreparedStatement stmt;

    public ADDNEWADMIN() {
        setContentPane(Jpanel11);
        setTitle("WELCOMEPAGE");
        setSize(350,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad = textPane1.getText();
                String ph = textField2.getText();
                String Name = textField1.getText();
                String spw = passwordField1.getText();
                String cpw = passwordField2.getText();
                if (spw.equals(cpw)){
                    String sql = "insert into  login  values('"+Name+"','"+cpw+"','admin','"+ad+"','"+ph+"')";
                    try {
                        stmt = conn.prepareStatement(sql);
                        int a  = stmt.executeUpdate();
                        if (a!=0){
                            JOptionPane.showMessageDialog(null,"NEW ADMIN REGISTERED");
                            setVisible(false);
                            new ADMINLOGIN();
                        }
                        else
                            System.out.println("failed");
                    }
                    catch (SQLException ep){
                        ep.printStackTrace();
                    }

                }
            }
        });

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textPane1.setText("");
                passwordField1.setText("");
                passwordField2.setText("");
            }
        });
    }
    public static void main(String args[]){
        ADDNEWADMIN  AD=new ADDNEWADMIN();
    }
}