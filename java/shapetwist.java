/*<applet code=shapetwist.java  height=900 width=900></applet>*/

import java.applet.*;
import java.awt.*;

public class shapetwist extends Applet{
  public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(75,100,125,100);
        g.drawLine(75,100,75,175);
        g.drawLine(125,100,125,175);
        g.drawLine(75,175,50,175);
        g.drawLine(125,175,150,175);
        g.drawLine(50,175,100,220);
        g.drawLine(150,175,100,220);
      }
}