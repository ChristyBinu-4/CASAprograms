import java.util.*;

class squareroot
{
  public static void main(String args[])
  {
    Scanner S = new Scanner(System.in);
    int a = S.nextInt();
    int i;
    for( n=1;n<a;n++)
    {
      i=a/n;
      System.out.println(n);
      if(i==n)
      {
        System.out.println(a+"is a perfect square");
        break;
      }
      
    }
  }
}