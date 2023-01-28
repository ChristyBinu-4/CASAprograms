import java.util.Scanner;
interface Figure 
{ 
 final static float PI=3.14F; 
 float area(float r); 
}
class Circle implements Figure 
{
   public float area(float r) 
   { 
     return PI*r*r; 
   } 
} 
class findarea
{ 
   public static void main(String args[]) 
   { 
     Scanner S = new Scanner(System.in);
     Circle C=new Circle(); 
     System.out.println("Enter radius :");
     int b = S.nextInt();
     System.out.println("Area="+C.area(b)); 
   } 
} 
