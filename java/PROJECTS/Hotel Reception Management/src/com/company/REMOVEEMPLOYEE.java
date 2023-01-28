package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class REMOVEEMPLOYEE extends JFrame{
    private JLabel LAB1;
    private JLabel LAB2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JLabel LAB3;
    private JButton CLICKTOREMOVEButton;
    private JPanel PAN;
    PreparedStatement stmt ;

    public REMOVEEMPLOYEE(){
      setContentPane(PAN);
      setTitle("REMOVE EMPLOYEE");
      setSize(450,300);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);
      connect s =  new connect();
      Connection conn = s.con;

        try {
            String sql = "select *  from LOGIN WHERE type ='customer service' or type ='food delivery' or type ='RECEPTION'";
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


        CLICKTOREMOVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String txt = textField1.getText();
                    String sq = "select * from  LOGIN WHERE TYPE ='ADMIN' and password='"+txt+"'";
                    stmt = conn.prepareStatement(sq);
                    ResultSet resultSet1= stmt.executeQuery();
                    if (resultSet1.next())
                    {
                        String e2= (String) comboBox1.getSelectedItem();
                        try {


                            String s1= "delete from LOGIN where  USERID='"+e2+"'";
                            stmt = conn.prepareStatement(s1);
                            int resultSet = stmt.executeUpdate();
                            if(resultSet!=0){
                                JOptionPane.showMessageDialog(null,"EMPLOYEE REMOVED");
                                setVisible(false);
                                }
                        }
                        catch (SQLException ep){
                            ep.printStackTrace();
                        }
                    }
                }
                catch (SQLException ep){
                    ep.printStackTrace();
                }
            }
        });
    }

    public static void main(String args[]){
        REMOVEEMPLOYEE RE =new REMOVEEMPLOYEE();
    }
}
