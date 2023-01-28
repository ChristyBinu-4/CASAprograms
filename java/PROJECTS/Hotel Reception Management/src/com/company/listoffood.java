package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class listoffood extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JLabel lsf;
    private JTextField textField1;
    private JTextField textField2;
    private JButton ADDNEWITEMButton;
    private JLabel ly;
    private JComboBox comboBox1;
    private JButton refreshButton;
    private JComboBox comboBox2;
    private JButton deleteItemButton;
    PreparedStatement stmt;
    public listoffood(){
        setContentPane(panel1);
        setTitle("FOOD DELIVERY");
        setSize(750, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s = new connect();
        Connection conn = s.con;
        try {
            String sql = "select List_of_food_item  from listoffood ";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                comboBox2.addItem(rs.getString(1));

            }
        }
        catch (SQLException ep){
            ep.printStackTrace();
        }

        try {
            String sql1 = "select * from listoffood";
            stmt = conn.prepareStatement(sql1);
            ResultSet rs =stmt.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (SQLException ep){
            ep.printStackTrace();
        }

        ADDNEWITEMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = textField1.getText();
                String n2 = textField2.getText();
                String n3 = (String) comboBox1.getSelectedItem();
                try {
                    String sql1 = "insert into listoffood values('"+n1+"',"+n2+",'"+n3+"')";
                    stmt = conn.prepareStatement(sql1);
                    int rs =stmt.executeUpdate();
                    if(rs!=0)
                    {
                        JOptionPane.showMessageDialog(null,"new item added successfully");
                        setVisible(false);
                        new listoffood();
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }

        });
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql1 = "select * from listoffood";
                    stmt = conn.prepareStatement(sql1);
                    ResultSet rs =stmt.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));

                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });


        deleteItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s2 = (String) comboBox2.getSelectedItem();
                try {
                    String sql = "delete from listoffood where List_of_food_item = '"+s2+"'";
                    stmt = conn.prepareStatement(sql);
                    int rs = stmt.executeUpdate();
                    if(rs!=0) {
                        JOptionPane.showMessageDialog(null," item deleted successfully");
                        setVisible(false);
                        new listoffood();
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
    }

    public static void main(String args[]){
        new listoffood();
    }
}
