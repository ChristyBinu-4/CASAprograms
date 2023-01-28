package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

public class NEW_EMPLOYEE_REGISTRATION extends JFrame{
    private JLabel LAABBELL;
    private JTextField textField2;
    private JLabel PHNO;
    private JPanel ADDD;
    private JLabel ADDR;
    private JLabel SETP;
    private JLabel CONP;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel SECT;
    private JComboBox comboBox1;
    private JButton SUBMITButton;
    private JButton CANCELButton;
    private JTextField textField3;
    private JLabel name;
    private JTextPane textPane1;
    PreparedStatement stmt;

    public NEW_EMPLOYEE_REGISTRATION(){
        setContentPane(ADDD);
        setTitle("NEW EMPLOYEE REGISTRATION");
        setSize(350, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;



        CANCELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NEW_EMPLOYEE_REGISTRATION();
            }
        });
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad = textPane1.getText();
                String ph = textField2.getText();
                String Name = textField3.getText();
                String spw = passwordField1.getText();
                String cpw = passwordField2.getText();
                if (spw.equals(cpw)){
                 System.out.println(cpw);
                 String sec = (String) comboBox1.getSelectedItem();
                 String sql = "insert into  login  values('"+Name+"','"+cpw+"','"+sec+"','"+ad+"','"+ph+"')";
                 try {
                     stmt = conn.prepareStatement(sql);
                     int a  = stmt.executeUpdate();
                     if (a!=0){
                          JOptionPane.showMessageDialog(null,"NEW EMPLOYEE REGISTERED");
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
    }

    public static void main(String args[]) {
        NEW_EMPLOYEE_REGISTRATION NER = new NEW_EMPLOYEE_REGISTRATION();}
}
