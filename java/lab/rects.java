/*<applet code=rects.java height=940 width=930></applet>*/
import java.applet.*;
import java.awt.*;

public class rects extends Applet
{
  public void paint(Graphics g)
  {
    g.drawRect(100,100,230,150);
    g.drawLine(100,300,200,300);
    g.drawLine(100,400,200,400);
    g.drawOval(175,300,50,100);
    g.drawArc(75,300,50,100,90,180);
  }
}