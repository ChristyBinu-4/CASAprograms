import java.util.*;

class fibonnacci
{
  public static void main(String args[])
  {
    int i,n,sum=0,a=0,b=1,c=0;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    System.out.println("Fibonnaci series upto"+ n + "is:");
    while(c<=n)
    {
       System.out.println(c+"");
       sum+=c;
       a=b;
       b=c;
       c=a+b;
    }
   System.out.println("Sum of the Fibonnaci series is"+ sum);
    
  }
}