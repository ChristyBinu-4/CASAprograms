package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Vacatingprocess extends JFrame {
    private JPanel panel1;
    private JLabel lj;
    private JComboBox comboBox1;
    private JLabel ABC;
    private JLabel CBA;
    private JTable table1;
    private JButton VACATEButton;
    PreparedStatement stmt;

    public Vacatingprocess() {
        setContentPane(panel1);
        setTitle("CUSTOMERDETAILS");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        String s7 = (String) comboBox1.getSelectedItem();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "select * from billpayment where roomno = "+s7+"";
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


        VACATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String sql ="update registration set Customer id='',phoneno='',address='',no_of_days=0,email='' where roomno="+s7+"";
                    stmt = conn.prepareStatement(sql);
                    int rs = stmt.executeUpdate();


                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
                try{
                    String sq ="update Customer_service set service='',staffassigned='',status='',service_charge=0,updates='no service needed' where roomno="+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="update Billpayment set customer id='',no_of_days=0,chargesoffood=0,service_charge=0,rent=0,totalamount=0 where roomno="+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="delete from food_delivery where roomno="+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }

        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String sq ="update billpayment set service_charge =(select service_charge from customer_service) where roomno = "+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="update billpayment set no_of_days =(select no_of_days from registration where roomno ="+s7+" ),customerid = (select customerid from registration where roomno ="+s7+") ,charges_of_food =(select sum(totalprice) from food_delivery where roomno ="+s7+") where roomno = "+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String sq ="update billpayment set rent = no_of_days*450 and totalprice = rent + charges_of_food + service_charge where roomno = "+s7+"";
                    stmt = conn.prepareStatement(sq);
                    ResultSet rs = stmt.executeQuery();


                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
    }
}
