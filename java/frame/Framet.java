import java.awt.*;
import java.awt.event.*;
/*<applet code=Framet.java hieght=900 width=900></applet>*/
public class Framet  extends Frame  {
 public Framet(){
     setBackground(Color.blue);
     addWindowListener(new WindowAdapter() 
 {
   public void windowClosing(WindowEvent e) 
     {
         super.windowClosing(e);
         System.exit(0);
      }
  } );
  
  }
  
public void paint(Graphics g)
 {
   g.setFont(new Font("TimesRoman",Font.BOLD,18));
   g.setColor(Color.red);
   g.drawString("Welcome.......",100,300);
  }
public static void main(String args[])
{
 Framet F=new Framet();
 F.setSize(500,400);          
 F.setTitle("Sample Frame");
 F.setVisible(true);
 }

     

}


