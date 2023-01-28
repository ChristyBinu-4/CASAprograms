package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UPDATESTATUS extends JFrame{
    private JPanel panel1;
    private JLabel JLAB1;
    private JComboBox comboBox1;
    private JLabel CST;
    private JLabel CURRENTSTAT;
    private JLabel STUP;
    private JRadioButton PROCEEDINGRadioButton;
    private JRadioButton ONGOINGRadioButton;
    private JRadioButton COMPLETEDRadioButton;
    private JButton SUBMITButton;
    private JButton RESETButton;
    private JButton BACKButton;
    private JButton refreshButton;
    private JLabel SELECTROOM;
    private JComboBox comboBox2;
    private JLabel sf;
    PreparedStatement stmt;

    public UPDATESTATUS(){
        setContentPane(panel1);
        setTitle("CUSTOMER SERVICE");
        setSize(650, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        try {
            String sql = "select *  from customer_service where   service ='food delivery'";
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
            String combo = (String) comboBox1.getSelectedItem();
            String sql = "select foodordered  from food_delivery where  roomno ="+combo+"";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                comboBox2.addItem(rs.getString(1));
            }

        }

        catch (SQLException ep){
            ep.printStackTrace();
        }


        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PROCEEDINGRadioButton.isSelected()){
                    try {
                        String combo = (String) comboBox1.getSelectedItem();
                        String sql3 = "update customer_service set STATUS =' FREE',service = '',staffassigned = '',updates = 'no service needed' where ROOMNO = "+combo+"";
                        stmt = conn.prepareStatement(sql3);
                        int rs = stmt.executeUpdate();
                        if (rs!=0)
                        {
                            JOptionPane.showMessageDialog(null,"service is set to being ABONDONED");
                        }

                    }
                    catch (SQLException ep) {
                        ep.printStackTrace();
                    }


                    try {
                        String cm = (String) comboBox2.getSelectedItem();
                        String combo = (String) comboBox1.getSelectedItem();
                        String sql3 = "delete from food_delivery  where ROOMNO = "+combo+" and food_ordered = '"+cm+"' ";
                        stmt = conn.prepareStatement(sql3);
                        stmt.executeUpdate();


                    }
                    catch (SQLException ep) {
                        ep.printStackTrace();
                    }
                }

                if (ONGOINGRadioButton.isSelected()){
                    if(CST.getText()=="PROCEEDING") {
                        try {
                            String combo = (String) comboBox1.getSelectedItem();
                            String sql3 = "update customer_service set STATUS ='ONGOING' where ROOMNO = " + combo + "";
                            stmt = conn.prepareStatement(sql3);
                            int rs = stmt.executeUpdate();
                            if (rs!=0) {
                                JOptionPane.showMessageDialog(null, "service is set to being ongoing");
                            }

                        } catch (SQLException ep) {
                            ep.printStackTrace();
                        }
                        try {
                            String combo = (String) comboBox1.getSelectedItem();
                            String cm = (String) comboBox2.getSelectedItem();
                            String sql3 = "update food_delivery set STATUS ='ONGOING' where ROOMNO = " + combo + " and food_ordered = '"+cm+"'";
                            stmt = conn.prepareStatement(sql3);
                            int rs = stmt.executeUpdate();
                            if (rs!=0) {
                                JOptionPane.showMessageDialog(null, "service is set to being ongoing");
                            }

                        } catch (SQLException ep) {
                            ep.printStackTrace();
                        }
                    }
                }

                if (COMPLETEDRadioButton.isSelected()){
                    if(CST.getText()== "ONGOING") {
                        try {
                            String combo = (String) comboBox1.getSelectedItem();
                            String sql3 = "update customer_service set STATUS =' FREE',service = '',staffassigned = '',updates = 'no service needed' where ROOMNO = " + combo + "";
                            stmt = conn.prepareStatement(sql3);
                            int rs = stmt.executeUpdate();
                            if (rs!=0) {
                                JOptionPane.showMessageDialog(null, "service is being completed");
                            }

                        } catch (SQLException ep) {
                            ep.printStackTrace();
                        }
                        try {
                            String combo = (String) comboBox1.getSelectedItem();
                            String cm = (String) comboBox2.getSelectedItem();
                            String sql3 = "update food_delivery set STATUS = ' FREE' where ROOMNO = " + combo + " and food_ordered = '"+cm+"'";
                            stmt = conn.prepareStatement(sql3);
                            int rs = stmt.executeUpdate();
                            if (rs!=0) {
                                JOptionPane.showMessageDialog(null, "service is set to being ongoing");
                            }

                        } catch (SQLException ep) {
                            ep.printStackTrace();
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "There are no ongoing services in the room");
                }
            }
        });


        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new UPDATESTATUS();
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String combo = (String) comboBox1.getSelectedItem();
                try {
                    String sql2 = "select STATUS from customer_service where ROOMNO = "+combo+"";
                    stmt = conn.prepareStatement(sql2);
                    ResultSet rs = stmt.executeQuery();
                    String com ;
                    if (rs.next())
                    {
                        com = rs.getString(1);
                        CST.setText(com);
                    }

                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String combo = (String) comboBox1.getSelectedItem();
                try {
                    String sql2 = "select STATUS from customer_service where ROOMNO = "+combo+"";
                    stmt = conn.prepareStatement(sql2);
                    ResultSet rs = stmt.executeQuery();
                    String com ;
                    if (rs.next())
                    {
                        com = rs.getString(1);
                        CST.setText(com);
                    }

                }
                catch (SQLException ep) {
                    ep.printStackTrace();
                }
            }
        });


    }
    public static void main(String args[]){
        new UPDATESTATUS();
    }
}


