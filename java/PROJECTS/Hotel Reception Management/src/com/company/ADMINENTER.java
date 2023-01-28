package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class ADMINENTER extends JFrame {
    private JPanel adepanel;
    private JLabel lbel1;
    private JLabel lbel2;
    private JTextField textField1;
    private JLabel lbel3;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JButton CANCELButton;
    private JLabel lllb11;
    private JButton backButton;

    PreparedStatement stmt ;

    public ADMINENTER() {
        setContentPane(adepanel);
        setTitle("WELCOMEPAGE");
        setSize(350, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                String str = textField1.getText();
                String pwd = passwordField1.getText();
                String sql = "select * from LOGIN where  USERID = '"+str+"' and PASSWORD  = '"+pwd+"' and TYPE = 'admin'";
                try {
                    stmt = conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    if(rs.next()==true)
                    {
                        new ADMINLOGIN();
                        setVisible(false);
                    }
                    else
                    {
                        lllb11.setText("Check your user name and password");

                    }

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        CANCELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WELCOMEPAGE();
            }
        });
    }







}
