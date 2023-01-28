import java.util.*;

class matrix
{
  public static void main(String args[])
  {
      int i,j,a,b,sum=0;
      Scanner s = new Scanner(System.in);
      System.out.println("enter the number of rows in matrix");
      a= s.nextInt();
      System.out.println("enter the number of columns in matrix");
      b= s.nextInt();
      System.out.println("enter the elements in matrix");
      int m [][] = new int [50][50];
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
             m[i][j] = s.nextInt();
         }
      }
      System.out.println("elements in matrix are :");
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
              System.out.println(m[i][j]);
         }
         System.out.println("\t");
      }

     for(i=0;i<a;i++)
      {
         for( j=0;j<b;j++)
         {
             if(i==j)
             {
               sum+=m[i][j];
             }
          }
       }
       System.out.println("Sum of diagonal elements in matrix are :"+ sum);
   }
}
      