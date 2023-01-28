package com.company;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class VACANTROOMS extends JFrame{
    private JLabel LLAB1;
    private JTable table1;
    private JButton BACKButton;
    private JPanel JP;
    PreparedStatement stmt;

    public VACANTROOMS(){
        setContentPane(JP);
        setTitle("VACANT ROOMS");
        setSize(300,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        connect s =  new connect();
        Connection conn = s.con;
        String sql = "select ROOMNO from registration where NO_OF_DAYS =0";
        try{
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

    public static void main(String args[]){
        VACANTROOMS HP=new VACANTROOMS ();
    }
}
