import java.util.*; 
class overload
{ 
 int r,h; 
 int sum(int x, int y) 
 { 
   r=x; 
   h=y; 
   return r+h; 
 } 
 void sum(String S1, String S2) 
 { 
   String S3; 
   S3=S1+S2; 
   System.out.print("Sum of two Strings: "+S3); 
 } 
 int sum(int n) 
 { 
   int d,s; 
   for(s=0; n!=0; n/=10) 
   { 
     d=n%10; 
     s+=d; 
   } 
   return s; 
  } 
} 
class Methodoverload 
 { 
 public static void main(String args[]) 
 { 
   int a,b;  
   String S1, S2; 
   Scanner S=new Scanner(System.in); 
   System.out.println("Enter two values:"); 
   a=S.nextInt(); 
   b=S.nextInt(); 
   overload A=new overload(); 
   System.out.println("Sum=" +A.sum(a,b)); 
   System.out.println("Enter two strings:"); 
   S1=S.next(); 
   S2=S.next(); 
   A.sum(S1,S2); 
   int n; 
   System.out.println("\nEnter a no"); 
   n=S.nextInt(); 
   System.out.println("Sum of digits="+A.sum(n)); 
  } 
} 
