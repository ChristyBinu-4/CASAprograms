import java.util.*;

class largesmall
{
  public  static void main(String args[])
  {
      Scanner Sc= new Scanner(System.in);
      System.out.println("enter a number :");
      int  n=Sc.nextInt();
      int  s,b,d;
      b=s=n%10;
      while(n !=0)
      {
        d=n%10;
        if(b<d)
            b=d;
        if(s>d)
            s=d;
        n=n/10;
      }
      System.out.print("largest : "+ b +"smallest :"+s);
  }
}