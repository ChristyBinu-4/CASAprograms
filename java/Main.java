
import java.util.*;


public class Main{
                          public static void main(String args[]){
                                  final byte monthinayear=12;
                                  final byte  percentage=100;


                                  Scanner sc =new Scanner(System.in);
                                  int principle=1000;
                                 double annualinterest=0;  
                                  double monthlyinterest=0;
                                  int t=0;
                                  int n=0;
                                   
                                   while(true){
                                     System.out.print("principle($1k-$1m):");
                                     principle=sc.nextInt();
                                    if(principle>=1000&&principle<=1000000)
                                           break;
                                    System.out.print("enter a number between 1000 and 1000000");
                                          
                                        
                                   }
                                          
                                   while(annualinterest==0){
                                            System.out.print("annual interest rate:");
                                           annualinterest=sc.nextFloat();
                                           if(annualinterest>0&&annualinterest<30)
                                                break;
                                           System.out.println("enter a number greater than 0 and less than 30");
                                           }  
                                  monthlyinterest=annualinterest/percentage/monthinayear;
                                  System.out.println("monthly interest is :"+monthlyinterest);     
                                   
                                  while(t==0){
                                          System.out.print("period(years):");
                                          t=sc.nextInt();
                                          if(t>0&&t<50)
                                                    break;
                                          System.out.println("enter a number between 0 and 50");
                                          }
                                  n=t*monthinayear;
                                  System.out.println(" month "+n);
                                  double M=principle
                                  *(monthlyinterest*Math.pow(1+monthlyinterest,n))/(Math.pow(1+monthlyinterest,n)-1);
                                  System.out.print("mortgage"+ M);
                                  }
                          
                          }           
                           