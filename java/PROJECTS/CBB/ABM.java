


import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ABM  {

private JFrame s = new JFrame("CBB ABM");
private JPanel p = new JPanel();
private JLabel c = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel a = new JLabel("1",JLabel.RIGHT);
private JLabel b = new JLabel("2",JLabel.RIGHT);
private JLabel i = new JLabel("3",JLabel.RIGHT);
private JButton cac= new JButton("CURRENT ACCOUNT");
private JButton sac= new JButton("SAVINGS ACCOUNT");
private JButton r= new JButton("EXIT ");


public ABM()  {


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

a.setBounds(150,150,100,100);
a.setForeground(Color.WHITE);
a.setFont(a.getFont().deriveFont(40.0f));
p.add(a);


b.setBounds(150,300,100,100);
b.setForeground(Color.WHITE);
b.setFont(b.getFont().deriveFont(40.0f));
p.add(b);


i.setBounds(150,450,100,100);
i.setForeground(Color.WHITE);
i.setFont(c.getFont().deriveFont(40.0f));
p.add(i);



cac.setBounds (300,150,300,100);
p.add(cac);
 

sac.setBounds (300,300,300,100);
p.add(sac);
 


r.setBounds (300,450,300,100);
p.add(r);

Font f = new Font("Times New Roman",Font.BOLD,24);
cac.setFont(f);
sac.setFont(f);
r.setFont(f);

cac.addActionListener(new ActionListener ()
{   
      public void actionPerformed (ActionEvent ce)
         {
            s.setVisible(false);   
            new CBC();
           
            
         }
});

sac.addActionListener(new ActionListener ()
{   
      public void actionPerformed (ActionEvent be)
         {
             s.setVisible(false); 
            new CBS();
           
         }
});


r.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent ae)
           {
              System.exit(0);
           }    
});


s.setVisible(true);
}


public static void main(String args[]){
                

              new ABM();
 }
}


