package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EMPLOYEELOGIN extends JFrame{
    private JPanel panelj1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JButton OKButton;
    private JLabel sector;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JPasswordField passwordField1;
    private JButton cancelButton;
    private JLabel fillfield;
    PreparedStatement stmt ;

    public EMPLOYEELOGIN() {
        setContentPane(panelj1);
        setTitle("WELCOMEPAGE");
        setSize(350, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField1.getText();
                String pwd = passwordField1.getText();
                String std = (String) comboBox1.getSelectedItem();
                String sql = "select * from LOGIN where  USERID = '"+str+"' and PASSWORD  = '"+pwd+"' and TYPE = '"+std+"'";
                try {
                    stmt = conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    if(rs.next())
                    {
                        System.out.println(std);
                        switch(std)
                        {
                            case "customer service":
                             {
                                 new CUSTOMERSERVICE();
                                 setVisible(false);
                             }
                             break;
                            case "food delivery" :
                              {
                                  new FOODDELIVERY();
                                  setVisible(false);
                              }
                              break;
                            case "RECEPTION":
                            {
                                new RECEPTION();
                                setVisible(false);
                            }
                            break;
                            default:fillfield.setText("select any  field");
                            break;
                        }
                    }
                    else
                    {
                        fillfield.setText("unable to  login");
                    }

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }
        });
    }

    public static void main(String args[]) {
        EMPLOYEELOGIN EL= new EMPLOYEELOGIN();}
}
