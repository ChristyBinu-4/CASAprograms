/*<applet code=shapes.java height=900 width=900></applet>*/
import java.applet.*;
import java.awt.*;

public class shapes extends Applet{
 public void paint(Graphics g){
    g.drawLine(100,100,40,200);
    g.drawLine(40,200,170,200);
    g.drawLine(170,200,100,100);
    g.setColor(Color.red);
    g.drawOval(75,140,50,50);
    g.setColor(Color.black);
    g.drawOval(500,100,200,200);
    g.fillOval(560,160,10,10);
    g.fillOval(630,160,10,10);
    int x[]={600,580,620};
    int z[]={200,220,220};
    int c=x.length;     
    g.drawPolygon(x,z,c);
    g.drawArc(550,240,100,40,20,130);
 }
}