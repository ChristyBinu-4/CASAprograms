package com.company;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class listoforders extends  JFrame{
    private JPanel panel1;
    private JLabel lab1;
    private JTable table1;
    private JButton BACKButton;
    PreparedStatement stmt;

    public listoforders(){
        setContentPane(panel1);
        setTitle("FOOD DELIVERY");
        setSize(550, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        try {
            String sql = "select roomno,food_ordered,quantiy,price,totalprice from customer_service natural join food_delivery where STATUS = 'PROCEEDING'";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ep){
            ep.printStackTrace();
        }
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
    public static void main(String args[]) {
        new listoforders();
    }
}
