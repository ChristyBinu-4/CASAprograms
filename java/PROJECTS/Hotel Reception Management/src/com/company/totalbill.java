package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class totalbill extends JFrame{
    private JLabel q1;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton backButton;
    private JPanel Jp;
    private JButton updateButton;
    PreparedStatement stmt;

    public totalbill(){
        setContentPane(Jp);
        setTitle("TOTAL BILL");
        setSize(350,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s = new connect();
        Connection conn = s.con;
        String f4 = (String) comboBox1.getSelectedItem();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "select * from billpayment where roomno ='"+f4+"'";
                try{
                    stmt = conn.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String sq ="update billpayment set service_charge =(select service_charge from customer_service) where roomno = "+f4+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="update billpayment set no_of_days =(select no_of_days from registration where roomno ="+f4+" ),customerid = (select customerid from registration where roomno ="+f4+") ,charges_of_food =(select sum(totalprice) from food_delivery where roomno ="+f4+") where roomno = "+f4+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="update billpayment set rent = no_of_days*450 and totalprice = rent + charges_of_food + service_charge where roomno = "+f4+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
    }
    public static void main(String args[]){
        new totalbill();
    }
}
