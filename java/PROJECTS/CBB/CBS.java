

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class CBS  {

private JFrame j = new JFrame("CBB ABM");
private JLabel c1 = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel a1 = new JLabel("1",JLabel.RIGHT);
private JLabel b1 = new JLabel("2",JLabel.RIGHT);
private JLabel i1 = new JLabel("3",JLabel.RIGHT);
private JLabel d = new JLabel("4",JLabel.RIGHT);
private JButton bal1= new JButton("BALANCE ENQUIRY");
private JButton with1= new JButton("WITHDRAW");
private JButton dep1= new JButton("DEPOSIT");
private JButton back= new JButton("BACK");
private JButton r2= new JButton("EXIT ");
private Font f = new Font("Times New Roman",Font.BOLD,24);

public CBS(){


j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel p2 = new JPanel();
j.setSize(1366,768);
j.getContentPane().add(p2);

p2.setLayout(null);
p2.setSize(1366,768);
p2.setBackground(Color.BLUE);


c1.setBounds(150,50,500,500);
c1.setForeground(Color.WHITE);
c1.setFont(c1.getFont().deriveFont(30.0f));
c1.setVerticalAlignment(JLabel.TOP);
p2.add(c1);


a1.setBounds(150,100,100,100);
a1.setForeground(Color.WHITE);
a1.setFont(a1.getFont().deriveFont(40.0f));
p2.add(a1);

b1.setBounds(150,250,100,100);
b1.setForeground(Color.WHITE);
b1.setFont(b1.getFont().deriveFont(40.0f));
p2.add(b1);


i1.setBounds(150,400,100,100);
i1.setForeground(Color.WHITE);
i1.setFont(i1.getFont().deriveFont(40.0f));
p2.add(i1);

d.setBounds(150,550,100,100);
d.setForeground(Color.WHITE);
d.setFont(d.getFont().deriveFont(40.0f));
p2.add(d);
 
bal1.setBounds (300,100,300,100);
p2.add(bal1);


with1.setBounds (300,250,300,100);
p2.add(with1);
 

dep1.setBounds (300,400,300,100);
p2.add(dep1);

back.setBounds(50,50,100,50);
p2.add(back);



r2.setBounds (300,550,300,100);
p2.add(r2);


bal1.setFont(f);
with1.setFont(f);
dep1.setFont(f);
r2.setFont(f);

bal1.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new SBE();
           }    
});

with1.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new SW();
           }    
});

dep1.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new SD();
           }    
});

back.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new ABM();
           }    
});



r2.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent we)
           {
              System.exit(0);
           }    
});


j.setVisible(true);
  }
}