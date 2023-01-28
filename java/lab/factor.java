import factors.*;
import java.util.*;

class  factor
{
  public static void main(String args[])
  {
    Fcts f = new Fcts();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int s = sc.nextInt();
    f.fact(s);
    
  }
}