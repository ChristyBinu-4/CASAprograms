/*<applet code=shape.java  height=900 width=900></applet>*/

import java.applet.*;
import java.awt.*;

public class shape extends Applet
{
  public void paint(Graphics g)
  {
        g.drawLine(75,100,125,100);
        g.drawLine(75,100,75,175);
        g.drawLine(125,100,125,175);
        g.drawLine(75,175,50,175);
        g.drawLine(125,175,150,175);
        g.drawLine(50,175,100,220);
        g.drawLine(150,175,100,220);
        g.drawOval(500,100,200,200);
        g.fillOval(560,160,10,10);
        g.fillOval(630,160,10,10);
        int x[]={600,580,620};
        int z[]={200,220,220};
        int c=x.length;     
        g.drawPolygon(x,z,c);
        g.drawArc(550,231,100,40,-20,-130);        
  }
}