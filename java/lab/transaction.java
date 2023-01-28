import java.util.*;
import details.*;
class transaction
{
  public  static void main(String[] args)
  {
   Scanner  S =  new Scanner(System.in);
   System.out.print("enter account number and name :" );
   int a = S.nextInt();
   String c =  S.next();
   bank  B = new bank(a,c);
   while(true)
   {
     System.out.print("1. deposit\n 2.withdraw\n  3.display " );
     int r=S.nextInt();
     switch(r)
     {
       case  1  :
                 System.out.println("amount  to  be  deposited :");
                 int  d  =  S.nextInt();
                 B.deposit(d);
                 System.out.println(d+"is deposited");
                 break;  
        case  2  :
                 System.out.println("amount  to  be  withdraw :");
                 int  w  =  S.nextInt();
                 B.withdraw(w);
                 System.out.println(w+"is withdrawn");
                 break;
         case  3  :
                 System.out.println(B.display());
                 break;  
        default :
                System.out.println("wrong  input");
                break;
     } 
    System.out.println("do you want to continue  yes : 1  no :0");
    int  j=S.nextInt();
    if(j==0)
      break;
    else
       continue;   
   }
      
  }
   
}
