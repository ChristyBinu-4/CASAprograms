package details;
public class bank
{
  public int acc_no;
  public String name;
  public int balance;
 
  public  bank(int a,String c)
    {
        acc_no = a;
        balance= 0;
        name = c;  
    } 
  
    public void withdraw(int w)
    {
      balance -=w;
    }

    public void deposit(int d) 
    {
        balance += d;
    }
    public int display()
    {
         System.out.print(name+"\n");
         System.out.print(acc_no+"\n");
         System.out.print("balance :");
         return balance;
    } 
}