package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class LISTOFSERVICES extends JFrame{
    private JPanel panel1;
    private JLabel LLAV;
    private JTable table1;
    private JButton EXITButton;
    PreparedStatement stmt;

    public LISTOFSERVICES(){
        setContentPane(panel1);
        setTitle("DETAILS OF SERVICES");
        setSize(1000,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        String sql = "select * from customer_service where updates = 'service assigned'";
        try{
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException ep){
            ep.printStackTrace();
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
        new LISTOFSERVICES();
    }


}
