/*<applet code=shapemodel.java  height=900 width=900></applet>*/

import java.applet.*;
import java.awt.*;

public class shapemodel extends Applet{
  public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(75,100,150,100);
        g.drawLine(75,150,150,150);
        g.drawLine(75,100,75,150);
        g.drawLine(150,100,150,80);
        g.drawLine(150,150,150,170);
        g.drawLine(150,80,190,125);
        g.drawLine(150,170,190,125);
      }
}