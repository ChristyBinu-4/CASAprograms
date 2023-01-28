


import java.awt.event.*;
import javax.swing.*;

import java.awt.*;


class SD {

private JFrame j= new JFrame("CBB ABM");
private JPanel panel = new JPanel();
private JLabel cbb = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel s_dep = new  JLabel("Your savings account balance is :",JLabel.RIGHT);
private JLabel s_d = new JLabel("Enter amount you want to dep:");
private JTextField s = new JTextField();
private JButton back= new JButton("BACK");
private JButton b = new JButton("Enter");
private JButton n = new JButton("Clear");
private Font f = new Font("Times New Roman",Font.BOLD,24);

public SD(){


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


s_dep.setBounds(150,250,500,500);
s_dep.setForeground(Color.WHITE);
s_dep.setFont(s_dep.getFont().deriveFont(30.0f));
s_dep.setVerticalAlignment(JLabel.TOP);
panel.add(s_dep);


s_d.setBounds(150,350,700,500);
s_d.setForeground(Color.WHITE);
s_d.setFont(s_d.getFont().deriveFont(30.0f));
s_d.setVerticalAlignment(JLabel.TOP);
panel.add(s_d);


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