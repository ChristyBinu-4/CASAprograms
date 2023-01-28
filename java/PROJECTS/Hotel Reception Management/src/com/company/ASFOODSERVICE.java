package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ASFOODSERVICE extends JFrame{
    private JPanel panel1;
    private JLabel FDS;
    private JLabel SRM;
    private JComboBox comboBox1;
    private JLabel SELEFOOD;
    private JLabel EMPS;
    private JComboBox comboBox3;
    private JButton CLICKTOPROCEEDButton;
    private JButton RESETButton;
    private JButton BACKButton;
    private JComboBox comboBox4;
    private JButton addToListButton;
    private JTextField enterQuantityOfEachTextField;
    private JTable table1;
    private JRadioButton startersRadioButton;
    private JRadioButton mainCourseRadioButton;
    private JRadioButton dessertsRadioButton;
    private JLabel price;
    private JLabel price1;
    private JButton refreshButton;
    private JLabel totalprice;
    PreparedStatement stmt;

    public ASFOODSERVICE(){
        setContentPane(panel1);
        setTitle("CATERING SERVICE");
        setSize(850, 350);
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
            String sql1 = "select *  from login  where TYPE = 'food delivery' ";
            stmt = conn.prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                comboBox3.addItem(rs.getString(1));
            }
        }
        catch (SQLException ep){
            ep.printStackTrace();
        }


        addToListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomno = (String) comboBox1.getSelectedItem();
                String emp = (String) comboBox3.getSelectedItem();
                String f2  = (String) comboBox4.getSelectedItem();
                String T1  = enterQuantityOfEachTextField.getText();
                String se = price1.getText();
                try {

                    String sql1 = "insert into food_delivery values('"+roomno+"','"+f2+"','"+T1+"','"+se+"',0,'PROCEEDING')";
                    stmt = conn.prepareStatement(sql1);
                    int s =stmt.executeUpdate();
                    if (s!=0)
                    {
                       JOptionPane.showMessageDialog(null,"new item added successfully");
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try {
                    System.out.println(roomno);
                    String sql1 = "select food_ordered,quantiy,price from food_delivery where roomno = "+roomno+"";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs =stmt.executeQuery();
                    if (rs.next())
                    {
                        table1.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try{
                    String bs = (String) comboBox3.getSelectedItem();
                    String sql1 = "update customer_service set service = 'food delivery',staffassigned = '"+bs+"',STATUS = 'PROCEEDING',service_charge = service_charge + 10 ,updates = 'service assigned' where roomno = '"+roomno+"'";
                    stmt = conn.prepareStatement(sql1);
                    stmt.executeUpdate();

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }

            }
        });
        startersRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String sql1 = "select * from listoffood  where type = 'Starters' ";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs = stmt.executeQuery();
                    comboBox4.removeAllItems();
                    while (rs.next()) {

                        comboBox4.addItem(rs.getString(1));

                    }
                } catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });
        mainCourseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String sql1 = "select * from listoffood  where type = 'Main' ";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs = stmt.executeQuery();
                    comboBox4.removeAllItems();
                    while (rs.next())
                    {

                        comboBox4.addItem(rs.getString(1));

                    }
                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });
        dessertsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String sql1 = "select * from listoffood  where type = 'Desserts'";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs = stmt.executeQuery();
                    comboBox4.removeAllItems();
                    while (rs.next()) {

                        comboBox4.addItem(rs.getString(1));

                    }
                } catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });


        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String f2  = (String) comboBox4.getSelectedItem();
                    String sql1 = "select amount from listoffood  where List_of_food_item = '"+f2+"'";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs1 = stmt.executeQuery();
                    if(rs1.next()) {
                        price1.setText(rs1.getString(1));
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomno = (String) comboBox1.getSelectedItem();
                try {
                    System.out.println(roomno);
                    String sql1 = "select food_ordered,quantiy,price from food_delivery where roomno = "+roomno+"";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs =stmt.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomno = (String) comboBox1.getSelectedItem();
                try {

                    String sql1 = "select food_ordered,quantiy,price from food_delivery where roomno = "+roomno+"";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs =stmt.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
                try {

                    String sql1 = "update food_delivery set totalprice = quantiy*price where roomno = "+roomno+"";
                    stmt = conn.prepareStatement(sql1);
                     int rs =stmt.executeUpdate();

                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
                try {
                    System.out.println(roomno);
                    String sql1 = "select sum(totalprice) from food_delivery where roomno = "+roomno+"";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs =stmt.executeQuery();
                    if(rs.next()) {
                        totalprice.setText(rs.getString(1));
                    }
                    else{
                        System.out.println("did'nt get the value");
                    }
                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ASFOODSERVICE();
            }
        });

        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }


    public static void main(String args[]){
        new ASFOODSERVICE();
    }
}
