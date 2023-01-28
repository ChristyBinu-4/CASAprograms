/*<applet code=olympiclogo.java width=900 height=1000></applet>*/

import java.applet.*;
import java.awt.*;

public class olympiclogo extends Applet{
  public void paint(Graphics g){
        Color A=new Color(118,161,27);
        Color B=new Color(7,174,220);
        Color C=new Color(231,221,0);
        g.setColor(B);
        g.drawOval(100,100,100,100);
        g.setColor(Color.black);
        g.drawOval(210,100,100,100);
        g.setColor(Color.red);
        g.drawOval(320,100,100,100);
        g.setColor(C);
        g.drawOval(160,170,100,100);
        g.setColor(A);
        g.drawOval(270,170,100,100);
     }
}