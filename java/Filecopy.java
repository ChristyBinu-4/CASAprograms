import java.io.*;
import java.awt.Desktop;

public class Filecopy
{
  public static void main(String args[]) throws IOException
    
    {
      File  F2= new File("F:\\statements\\testcopy.txt");
      F2.createNewFile();
      int b;
      DataInputStream F1 = new DataInputStream(System.in);
      FileOutputStream F= new FileOutputStream("testcopy.txt");
      b=F1.read();
      while(F1.available()!=0)
        {
          if(b >= 'a'&& b<='z')
             {
               b=b-32;
             }
           else if (b >= 'A'&& b<='Z')
             {
               b=b+32;
             }
           
        }
         F.write(b);
         Desktop d= Desktop.getDesktop();  
         d.open(F2);
         F1.close();
         F.close();
         
         
    }
}