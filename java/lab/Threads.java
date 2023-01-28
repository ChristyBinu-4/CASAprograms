class A extends Thread 
{ 
 public void run() 
 { 
   for(int i=1; i<=10; ++i) 
   { 
     if(i==2) 
       Thread.yield(); 
     System.out.println("i=" + i); 
   } 
 System.out.println("Exit from A"); 
  } 
} 
class B extends Thread 
{ 
 public void run() 
 { 
    for(int j=1; j<=5; ++j)  
    { 
      System.out.println("j=" + j); 
      if(j==3)
        stop(); 
    } 
    System.out.println("Exit from B"); 
  } 
} 
class C extends Thread 
{ 
 public void run() 
 { 
   for(int k=1; k<=5; ++k) 
   { 
      System.out.println("k=" + k); 
 
      if(k==1) 
         try 
         { 
           sleep(2000);  
         } 
         catch(Exception e) 
         { 
            System.out.println("Exception caught"); 
         } 
    } 
    System.out.println("Exit from C"); 
 } 
} 
class Threads
{ 
 public static void main(String args[]) 
 { 
    new A().start(); 
    new B().start(); 
    new C().start(); 
 } 
} 
