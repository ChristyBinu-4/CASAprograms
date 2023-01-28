package Mda;

import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat ;


public class OptionMenu extends Account
{
      Scanner s = new Scanner(System.in);
      DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00"); 
       
      HashMap<Integer,Integer>  data = new HashMap<Integer,Integer>();
      public void getlogin() throws IOException
      {
          int x = 1;
         do
               {
                 try{
                          data.put(7474748,1234);
                          data.put(1237488,4191);
                          data.put(1235090,1865);
                          System.out.println("Welcome to ATM");
                          System.out.println("Enter your Account number");
                          setAccountNumber(s.nextInt());
                          System.out.println("Enter your pin number");
                          setPinNumber(s.nextInt());
                          
                         }
                     catch(Exception e)
                         {
                          System.out.println("invalid input");
                          x = 2;
                         }

                        for (HashMap.Entry<Integer , Integer> entry : data.entrySet())
                        {
                          if (entry.getKey() == getAccountNumber() && entry.getValue() == getPinNumber())
                            getAccountType();
                        }
                        
               }
               while(x == 1); 
       }

       public void getAccountType()
           {
             System.out.println("Select type of account :");
             System.out.println("1 : Current Account");
             System.out.println("2 : Savings Account");
             System.out.println("3 : Exit");
             System.out.println("Enter an option :");
             selection = s.nextInt();
             
             switch(selection)
                {
                 case 1 :  getCurrentAccount();
                               break;

                 case 2 : getSavingsAccount();
                               break;

                 case 3 : System.out.println("Thank you for using ATM");
                               break;
                 
                 default : System.out.println("invalid number");
                                 getAccountType();
                                                
                  }  
             }
     
             public void getCurrentAccount()
                {
                 System.out.println("1 : Balance enquiry");
                 System.out.println("2 : Cash withdrawal");
                 System.out.println("3 : Deposit fund");
                 System.out.println("4 : Exit");                  
                 System.out.println("Enter an option");
                 selection = s.nextInt();

                 switch(selection)
                     {
                      case 1 : System.out.println("Current account balance is :"+moneyformat.format(balanceCurrentAccount()));
                                    getAccountType();
                                    break;

                      case 2 : withdrawalCurrentAccount();
                                    getAccountType();
                                    break;

                      case 3 : depositCurrentAccount();
                                    getAccountType();
                                    break;

                      case 4 : System.out.println("Thank you for using ATM");
                                    break;
                    
                     default : System.out.println("Invalid number");
                                     getCurrentAccount();
                                     
                                   
                      }
             }
           public void getSavingsAccount()   
             { 
               System.out.println("1 : Balance enquiry");
               System.out.println("2 : Cash withdrawal");
               System.out.println("3 : Deposit fund");
               System.out.println("4 : Exit");
               System.out.println("Enter an option :");
               selection=s.nextInt();

               switch(selection)
                 {
                    case 1 : System.out.println("Savings account balance is:"+moneyformat.format(balanceSavingsAccount()));
                                  getAccountType();
                                  break;

                    case 2 : withdrawalSavingsAccount();
                                  getAccountType();
                                  break;

                    case 3 : depositSavingsAccount();
                                  getAccountType();
                                  break;

                    case 4 : System.out.println("Thank you for using ATM");
                                  break;
                   
                   default : System.out.println("invalid number");
                                    getSavingsAccount();
                                 

                 }
             }
          
          int selection;
      
      
        
}
