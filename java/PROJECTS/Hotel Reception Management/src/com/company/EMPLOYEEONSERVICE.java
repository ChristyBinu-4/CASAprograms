package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class EMPLOYEEONSERVICE extends JFrame{
    private JPanel panel1;
    private JLabel LAB;
    private JTable table1;
    private JButton EXITButton;
    private JTable table2;
    private JTable table3;
    private JLabel LAB2;
    PreparedStatement stmt;

    public EMPLOYEEONSERVICE()
    {
        setContentPane(panel1);
        setTitle("LIST OF EMPLOYEES ON SERVICE");
        setSize(1000,750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        String sql = "select roomno,staffassigned,service from customer_service where status ='proceeding'";
        try{
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        String sQ = "select roomno,staffassigned,service from customer_service where status ='ONGOING'";
        try{
            stmt = conn.prepareStatement(sQ);
            ResultSet rs = stmt.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException ep){
            ep.printStackTrace();
        }
        String se = "select roomno,staffassigned,service from customer_service where status ='free'";
        try{
            stmt = conn.prepareStatement(se);
            ResultSet rs = stmt.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException et){
            et.printStackTrace();
        }


        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public static void main(String args[])
    {
        new EMPLOYEEONSERVICE();
    }

}
