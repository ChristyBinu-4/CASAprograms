package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CUSTOMERDETAILS extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPanel jpanel1;
    private JButton OKButton;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JComboBox comboBox1;
    private JLabel lb1;
    private JButton SEARCHButton;
    private JLabel lbbbb;
    PreparedStatement stmt ;

    public CUSTOMERDETAILS(){
        setContentPane(jpanel1);
        setTitle("CUSTOMERDETAILS");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        try {
            String sql = "select *  from registration where  NO_OF_DAYS >0";
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

        SEARCHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sec = (String) comboBox1.getSelectedItem();
                try {
                    String sq = "select *  from registration where ROOMNO = '"+sec+"'";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();
                    if(rs.next())
                    {
                        String  l1 =  rs.getString(2);
                        String  l2 =  rs.getString(4);
                        String  l3 =  rs.getString(3);
                        String  l4 =  rs.getString(6);
                        String  l5 =  rs.getString(5);

                        lb1.setText(l1);
                        lb2.setText(l2);
                        lb3.setText(l3);
                        lb4.setText(l4);
                        lb5.setText(l5);

                    }
                    else
                    {
                        System.out.println("unable  to  login");
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
    public static void main(String args[]){
        CUSTOMERDETAILS CS=new CUSTOMERDETAILS();
    }
}
