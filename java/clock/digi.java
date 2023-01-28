/*<applet code=digi width=300 height=200></applet>*/
import  java.applet.*;
import  java.awt.*;
import  java.util.*;
import java.text.*;
 
public class digi extends Applet implements Runnable
{
 Thread t=null;
 Font F;
 int hours =0,minutes=0,seconds=0;
 String timeString="";
   
  public void init()
  {
      setBackground(Color.green);
      F=new Font("Helevicta",Font.PLAIN,20);
  }
 public void start()
    {
      t= new Thread( this );
      t.start();
      }
  
  public void run()
  {
     try
         {
           while(true){
                  Calendar cal=Calendar.getInstance();
                  hours=cal.get(Calendar.HOUR_OF_DAY);
                  if(hours >12) 
                    hours=12;
                  minutes = cal.get(Calendar.MINUTE);
                  seconds=cal.get(Calendar.SECOND);
                   
                  SimpleDateFormat  f= new SimpleDateFormat("hh:mm:ss");
                  Date date=cal.getTime();
                  timeString=f.format(date);
                  
                   repaint();
                   t.sleep(1000);
                         }
               }
         catch (Exception e){}
      }
    
     public void paint (Graphics g){
         g.setFont(F);
         g.setColor(Color.blue);
         g.drawString(timeString,50,50);
      

     }
}  
 
                     
              

  
     