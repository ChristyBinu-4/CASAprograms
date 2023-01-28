package factors;
public class Fcts
{
  public void fact(int x)
  {
    System.out.print("Factors of " + x + " are: ");
    for (int i = 1; i <= x; ++i) 
    {
      if (x % i == 0) 
      {
        System.out.print(i + " ");
      }
     }
   } 
}