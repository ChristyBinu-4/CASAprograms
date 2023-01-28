

import java.awt.event.*;
import javax.swing.*;

import java.awt.*;


class SW {

private JFrame j= new JFrame("CBB ABM");
private JPanel panel = new JPanel();
private JLabel cbb = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel s_with = new  JLabel("Your savings account balance is :",JLabel.RIGHT);
private JLabel s_w = new JLabel("Enter amount you want to withdraw :");
private JTextField s = new JTextField();
private JButton back= new JButton("BACK");
private JButton b = new JButton("Enter");
private JButton n = new JButton("Clear");
private Font f = new Font("Times New Roman",Font.BOLD,24);

public SW(){


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


s_with.setBounds(150,250,500,500);
s_with.setForeground(Color.WHITE);
s_with.setFont(s_with.getFont().deriveFont(30.0f));
s_with.setVerticalAlignment(JLabel.TOP);
panel.add(s_with);


s_w.setBounds(150,350,700,500);
s_w.setForeground(Color.WHITE);
s_w.setFont(s_w.getFont().deriveFont(30.0f));
s_w.setVerticalAlignment(JLabel.TOP);
panel.add(s_w);


s.setBounds(150,400,500,50);
panel.add(s);


back.setBounds(50,50,100,50);
panel.add(back);



b.setBounds(750,400,100,50);
panel.add(b);


n.setBounds(890,400,100,50);
panel.add(n);



b.setFont(f);
s.setFont(f);
n.setFont(f);

back.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new CBS();
           }    
});




}
}