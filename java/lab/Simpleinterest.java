/* <applet code=Simpleinterest.java width=500  height=400>
<param name=p value=10000>
<param name=n value=10>
<param name=r value=6>
</applet>*/
import java.applet.*;
import java.awt.*;
public  class Simpleinterest  extends  Applet
{
       int p,n,r,i;
       String  s;
       public void init()
       {
          p=Integer.parseInt(getParameter("p"));
          n=Integer.parseInt(getParameter("n"));
          r=Integer.parseInt(getParameter("r"));
          i=(p*n*r)/100;
          s=String.valueOf(i);
       }
       public void paint(Graphics g)
       {
         g.drawString("Interest=",10,150);
         g.drawString(s,70,150);
       }
}