/*<applet code=emoji.java width=300 height=400></applet>*/

import java.applet.*;
import java.awt.*;

public class emoji extends Applet{

public void paint(Graphics g){
g.drawOval(70,60,120,100);
g.fillOval(105,90,15,20);
g.fillOval(140,90,15,20);
g.drawArc(95,105,70,35,-10,-160);
  }
}
