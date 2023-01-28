

import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;


public  class CBE {

private JFrame j= new JFrame("CBB ABM");
private JPanel panel = new JPanel();
private JLabel cbb = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel cbalance_en = new  JLabel("Your current account balance is :",JLabel.RIGHT);
private JLabel e = new JLabel();
private JButton back= new JButton("BACK");
private JButton b = new JButton("Back to home");
private JButton c = new JButton("Exit");

Font f = new Font("Times New Roman",Font.BOLD,25);
connection con;
Statement  stmt;

connect s  = new connect();
reader rea  =  new  reader();
String  str = rea.acc;
String  SQL=  "SELECT Current_balance  FROM accounts WHERE Accno=" + str+"";
try
{  
   stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery(SQL);
   while(rs.next())
   {
    String text = rb.getString(Current_balance);
   }
   e.setText(text);                   
}
catch(SQLException ex)
{ 
  System.out.println("classnotfound");         
}        


public CBE() {



j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setSize(1366,768);
j.add(panel);
j.setVisible(true);



panel.setLayout(null);
panel.setSize(1366,768);
panel.setBackground(Color.BLUE);


cbb.setBounds(150,50,500,500);
cbb.setForeground(Color.WHITE);
cbb.setFont(cbb.getFont().deriveFont(30.0f));
cbb.setVerticalAlignment(JLabel.TOP);
panel.add(cbb);

s.setVisible(false);
System.out.println(ac);

e.setBounds(150,150,500,500);
e.setForeground(Color.WHITE);
e.setFont(cbb.getFont().deriveFont(30.0f));
e.setVerticalAlignment(JLabel.TOP);




cbalance_en.setBounds(150,250,500,500);
cbalance_en.setForeground(Color.WHITE);
cbalance_en.setFont(cbalance_en.getFont().deriveFont(30.0f));
cbalance_en.setVerticalAlignment(JLabel.TOP);
panel.add(cbalance_en);


back.setBounds(50,50,100,50);
panel.add(back);



b.setBounds(190,550,200,50);
panel.add(b);


c.setBounds(450,550,200,50);
panel.add(c);

back.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new CBC();
           }    
});

b.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent be)
           {
             j.setVisible(false);
             new ABM();

           }    
});


c.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent e)
           {
              System.exit(0);
           }    
});
panel.add(e);
b.setFont(f);
c.setFont(f);


}
}


