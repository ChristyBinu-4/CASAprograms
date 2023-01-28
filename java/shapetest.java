/*<applet code=shapetest.java height=940 width=930></applet>*/
import java.applet.*;
import java.awt.*;

public class shapetest extends Applet {
  public void paint(Graphics g){
         Color Y=new Color(255,202,0);
         g.setColor(Y);
         g.fillRect(100,100,300,150);
         g.setColor(Color.red);
         g.fillOval(210,150,70,50);
         g.setColor(Color.green);
         g.drawRect(100,300,300,150);
         g.setColor(Color.black);
         g.drawLine(100,300,400,450);
         g.drawLine(100,450,400,300);
         g.drawLine(100,500,200,500);
         g.drawLine(100,600,200,600);
         g.drawOval(175,500,50,100);
         g.drawArc(75,500,50,100,90,180);
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
   