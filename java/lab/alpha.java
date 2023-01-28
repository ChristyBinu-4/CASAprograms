import java.util.*;

class alpha
{
  public static void main(String args[])
  {
    int i;
    Scanner s = new Scanner(System.in);
    String name [] ={"rahul","sona","adarsh","alma"};
    int n=4;
    System.out.println("names to be sorted are:");
    for(i=0;i<n;i++)
    {
      System.out.println(name[i]);
    }
    String temp;
    for(i=0;i<n;i++)
    {
       for(int j=i+1;j<n;j++)
       {
         if(name[i].compareTo(name[j]) > 0)
         {
            temp = name[i];
            name[i] = name[j];
            name[j] =  temp;
         }
       }
    } 
    
    System.out.println("names in alphabetic order are");
    for(i=0;i<n;i++)
    {
      System.out.println(name[i]);
    }
  }
}