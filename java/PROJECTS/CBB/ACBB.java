
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ACBB 
{
  public JFrame s = new JFrame("CBB ABM");
  private JPanel p = new JPanel();
  private JLabel c = new JLabel("CBB Automatic banking Machine",JLabel.RIGHT);
  private JLabel e = new JLabel("Enter your account number :");
  private JLabel e3=new JLabel("Enter Your pin number :");
  public JLabel e2 = new JLabel();
  public JTextField t = new JTextField(1);
  private JTextField t2=new JTextField(1);
  private JButton enter = new JButton("Enter");
  private JButton clear = new JButton("clear");
  
  connection con;
  Statement  stmt;
  public void connect()
  {
     
      try 
      {
        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/root","root","");
      }
      catch (Exception e) {  
                System.out.println("classnotfound");  
            }  
      catch(SQLException ex)
      { 
       System.out.println("classnotfound");         
      }        
  }
  public  String reader()
  {
     acc = t.getText;
     return acc; 
  }
  public ACBB() 
  {
    
      
    connect();
    s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    s.setSize(1366,768);
    s.getContentPane().add(p);
    
    p.setLayout(null);
    p.setSize(1366,768);
    p.setBackground(Color.BLUE);

    c.setBounds(150,50,500,500);
    c.setForeground(Color.WHITE);
    c.setFont(c.getFont().deriveFont(30.0f));
    c.setVerticalAlignment(JLabel.TOP);
    p.add(c);

    e.setBounds(150,250,500,50);
    e.setForeground(Color.WHITE);
    e.setFont(e.getFont().deriveFont(30.0f));
    p.add(e);
    
   
    e2.setForeground(Color.WHITE);
    e2.setFont(e.getFont().deriveFont(30.0f));
    e2.setBounds(150,600,700,50);
    p.add(e2);
     
    e3.setBounds(150,390,500,50);
    e3.setFont(e.getFont().deriveFont(30.0f));
    e3.setForeground(Color.WHITE);
    p.add(e3);
 
    t.setBounds(600,250,300,50);
    t2.setBounds(600,390,200,50);
  
    
    enter.addActionListener(new ActionListener ()
    {
         public void actionPerformed(ActionEvent ce)
          { 
                 String str  = reader();
                 String std = t2.getText(); 
                 String SQL = "SELECT * FROM accounts WHERE Accno=" + str +"  and   pin="+ std +"";
                 try
                 {  
                      stmt = con.createStatement();
                      ResultSet rs = stmt.executeQuery(SQL);
                      if(rs.next())
                      {
                         new ABM();
                         s.setVisible(false);
                      }
                      else
                      {
                        String st ="Account number or pin number is incorrect";
                        e2.setText(st);
                      }  
                 }
                 catch(SQLException ex)
                 { 
                   System.out.println("classnotfound");         
                 }        
          }
    });

    p.add(t);
    p.add(t2);
    
    enter.setBounds(390,550,100,50);
    p.add(enter);

    clear.setBounds(560,550,100,50);
    clear.addActionListener(new ActionListener ()
    {
         public void actionPerformed(ActionEvent ce)
          { 
                 s.setVisible(false);
                 new ACBB();
          }
    });
    p.add(clear);
    

    s.setVisible(true );
  }
  
  public static void main(String args[])
  {  
       new ACBB();
       
  }

} 