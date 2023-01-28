import java.util.*;

class perfectsq 
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter any number");
     double n = s.nextDouble();
     double sqrt = Math.sqrt(n);
     int p = (int)sqrt;
     if(sqrt == p)
     {
         System.out.println("given number is a perfect square");
     }
     else
      {
         System.out.println("given number is not a perfect square");
      }
     
  }
}