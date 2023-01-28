

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class CW {

private JFrame j= new JFrame("CBB ABM");
private JPanel panel = new JPanel();
private JLabel cbb = new JLabel("CBB Automatic Banking Machine",JLabel.RIGHT);
private JLabel c_with = new  JLabel("Your current account balance is :",JLabel.RIGHT);
private JLabel c_w = new JLabel("Enter amount you want to withdraw :");
private JTextField c = new JTextField();
private JButton back= new JButton("BACK");
private JButton b = new JButton("Enter");
private JButton n = new JButton("Clear");

public CW(){

j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setSize(1366,768);
j.add(panel);


panel.setLayout(null);
panel.setSize(1366,768);
panel.setBackground(Color.BLUE);


cbb.setBounds(150,50,500,500);
cbb.setForeground(Color.WHITE);
cbb.setFont(cbb.getFont().deriveFont(30.0f));
cbb.setVerticalAlignment(JLabel.TOP);
panel.add(cbb);


c_with.setBounds(150,250,500,500);
c_with.setForeground(Color.WHITE);
c_with.setFont(c_with.getFont().deriveFont(30.0f));
c_with.setVerticalAlignment(JLabel.TOP);
panel.add(c_with);


c_w.setBounds(150,350,700,500);
c_w.setForeground(Color.WHITE);
c_w.setFont(c_w.getFont().deriveFont(30.0f));
c_w.setVerticalAlignment(JLabel.TOP);
panel.add(c_w);

c.setBounds(150,400,500,50);
panel.add(c);


back.setBounds(50,50,100,50);
panel.add(back);




b.setBounds(750,400,100,50);
panel.add(b);


n.setBounds(880,400,100,50);
panel.add(n);

back.addActionListener (new ActionListener ()
{
      public void actionPerformed (ActionEvent se)
           {
              j.setVisible(false);
              new CBC();
           }    
});

Font f = new Font("Times New Roman",Font.BOLD,24);
b.setFont(f);
c.setFont(f);
n.setFont(f);

j.setVisible(true);

}
}