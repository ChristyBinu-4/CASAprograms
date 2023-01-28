

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class CBC  {

private JFrame s = new JFrame("CBB ABM");
private JPanel p1 = new JPanel();
private JLabel mai = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel a = new JLabel("1",JLabel.RIGHT);
private JLabel b = new JLabel("2",JLabel.RIGHT);
private JLabel i = new JLabel("3",JLabel.RIGHT);
private JLabel d = new JLabel("4",JLabel.RIGHT);
private JButton bal= new JButton("BALANCE ENQUIRY");
private JButton with= new JButton("WITHDRAW");
private JButton dep= new JButton("DEPOSIT");
private JButton back= new JButton("BACK");
private JButton r1= new JButton("EXIT ");
private Font f = new Font("Times New Roman",Font.BOLD,24);



public CBC() {


s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

s.setSize(1366,768);
s.getContentPane().add(p1);
s.setVisible(true);

p1.setLayout(null);
p1.setSize(1366,768);
p1.setBackground(Color.BLUE);


mai.setBounds(150,50,500,500);
mai.setForeground(Color.WHITE);
mai.setFont(mai.getFont().deriveFont(30.0f));
mai.setVerticalAlignment(JLabel.TOP);
p1.add(mai);


a.setBounds(150,100,100,100);
a.setForeground(Color.WHITE);
a.setFont(a.getFont().deriveFont(40.0f));
p1.add(a);


b.setBounds(150,250,100,100);
b.setForeground(Color.WHITE);
b.setFont(b.getFont().deriveFont(40.0f));
p1.add(b);


i.setBounds(150,400,100,100);
i.setForeground(Color.WHITE);
i.setFont(i.getFont().deriveFont(40.0f));
p1.add(i);


d.setBounds(150,550,100,100);
d.setForeground(Color.WHITE);
d.setFont(d.getFont().deriveFont(40.0f));
p1.add(d);
 

bal.setBounds (300,100,300,100);
p1.add(bal);



with.setBounds (300,250,300,100);
p1.add(with);
 

dep.setBounds (300,400,300,100);
p1.add(dep);

back.setBounds(50,50,100,50);
p1.add(back);

r1.setBounds (300,550,300,100);
p1.add(r1);


bal.setFont(f);
with.setFont(f);
dep.setFont(f);
r1.setFont(f);

bal.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              s.setVisible(false);
              new CBE();
           }    
});

with.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              s.setVisible(false);
              new CW();
           }    
});

dep.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              s.setVisible(false);
              new CD();
           }    
});

back.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              s.setVisible(false);
              new ABM();
           }    
});




r1.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent qe)
           {
              System.exit(0);
           }    
});



  }
}