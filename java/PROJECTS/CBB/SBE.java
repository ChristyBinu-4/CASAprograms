

import java.awt.event.*;
import javax.swing.*;

import java.awt.*;


class SBE {

private JFrame j= new JFrame("CBB ABM");
private JPanel panel = new JPanel();
private JLabel cbb = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel sbalance_en = new  JLabel("Your savings account balance is :",JLabel.RIGHT);
private JButton b = new JButton("Back to home");
private JButton c = new JButton("Exit");
private JButton back= new JButton("BACK");



public SBE(){


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


sbalance_en.setBounds(150,250,500,500);
sbalance_en.setForeground(Color.WHITE);
sbalance_en.setFont(sbalance_en.getFont().deriveFont(30.0f));
sbalance_en.setVerticalAlignment(JLabel.TOP);
panel.add(sbalance_en);


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
              new CBS();
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

Font f = new Font("Times New Roman",Font.BOLD,25);
b.setFont(f);
c.setFont(f);

}
}