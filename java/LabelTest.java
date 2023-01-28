/*<applet code="LabelTest.java" height=1000  width=1000></applet>*/

import java.applet.*;
import java.awt.*;

public class LabelTest extends Applet
 {
   public void init()
     {
         Label L1=new Label();
         L1.setText("Computer Science");
         Label L2=new Label("Electronics");
         add(L1);
         add(L2);
       }
}