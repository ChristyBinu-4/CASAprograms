package Mda;

import java.util.*;
import java.text.DecimalFormat;

public class Account
  {
          Scanner sc=new Scanner(System.in);
          DecimalFormat moneyformat= new DecimalFormat("'$'###,##0.00");
           
           public int setAccountNumber(int accountNumber)
             {
              this.accountNumber=accountNumber;
               return accountNumber;
             }  
           
          public  int getAccountNumber()
              {
                return accountNumber;
              } 
            
          public int setPinNumber(int pinNumber)
             {
               this.pinNumber=pinNumber;
               return pinNumber;
             }

         public  int getPinNumber()
             {
                return pinNumber;
             }  
         
         public double balanceCurrentAccount()
             {
                return currentAccountbal;
             }
         
        public double balanceSavingsAccount()
            {
               return savingsAccountbal;
            }  

        public double calCurrentdeposit(double amount)
           {
               currentAccountbal = (currentAccountbal+amount);
               return currentAccountbal;
           } 
       
       public double calSavingsdeposit(double amount)
          {
             savingsAccountbal = (savingsAccountbal+amount);
             return savingsAccountbal;
          }

       public double calCurrentWithdraw(double amount)
         {
             currentAccountbal=(currentAccountbal-amount);
             return currentAccountbal;
         }

       public double calSavingsWithdraw(double amount)
        {
           savingsAccountbal = (savingsAccountbal-amount);
           return savingsAccountbal;
        }

      public void withdrawalCurrentAccount()
        {
            System.out.println("Current Account balance  : "+moneyformat.format(currentAccountbal));
            System.out.println("Enter amount you want to withdraw:");
            double amount = sc.nextInt();
             
             if((currentAccountbal-amount)>=0)
                  {
                      calCurrentWithdraw(amount);
                      System.out.println("New current account balance :" + moneyformat.format(currentAccountbal));
                  }
              else
                  {
                      System.out.println("Invalid input");
                  }
         }
           
       public void withdrawalSavingsAccount()
           {
                System.out.println("Savings Account balance :"+moneyformat.format(savingsAccountbal));
                System.out.println("Enter amount you want to withdraw :");
                double amount  = sc.nextInt();

                if((savingsAccountbal-amount)>=0)
                   {
                       calSavingsWithdraw(amount);
                       System.out.println("New savings account balance :"+ moneyformat.format(savingsAccountbal));
                   } 
                else
                  {
                     System.out.println("invalid input");
                  }
           }

       public void depositCurrentAccount()
          {
             System.out.println("Current Account balance  : "+moneyformat.format(currentAccountbal));
            System.out.println("Enter amount you want to deposit:");
            double amount = sc.nextInt();
             
             if((currentAccountbal+amount)>=0)
                  {
                      calCurrentdeposit(amount);
                      System.out.println("New current account balance :" + moneyformat.format(currentAccountbal));
                   }
             else
                  {
                     System.out.println("invalid input");
                  }           
          }
        
       public void depositSavingsAccount()
          {
             System.out.println("Savings Account balance  : "+moneyformat.format(savingsAccountbal));
            System.out.println("Enter amount you want to deposit:");
            double amount = sc.nextInt();
             
             if((currentAccountbal+amount)>=0)
                  {
                      calSavingsdeposit(amount);
                      System.out.println("New Savings account balance :" + moneyformat.format(savingsAccountbal));
                   }
             else
                  {
                     System.out.println("invalid input");
                  }           
          }

      private int accountNumber;
      private int pinNumber;
      private double amount;
      private double currentAccountbal=0;
      private double savingsAccountbal=0;
  }
