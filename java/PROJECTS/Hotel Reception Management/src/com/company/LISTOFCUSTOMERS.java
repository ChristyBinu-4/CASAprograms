package com.company;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class LISTOFCUSTOMERS extends JFrame{
    private JPanel PAN;
    private JLabel LAB1;
    private JTable table1;
    private JButton buttoo;
    PreparedStatement stmt;

    public LISTOFCUSTOMERS(){
        setContentPane(PAN);
        setTitle("LIST OF CUSTOMERS");
        setSize(1000,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        String sql = "select * from registration where NO_OF_DAYS > 0";
        try{
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException ep){
            ep.printStackTrace();
        }


        buttoo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
    public static void main(String args[]){
        LISTOFCUSTOMERS HP=new LISTOFCUSTOMERS();
    }
}
