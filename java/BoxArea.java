class Box{
  int l,b;
  Box(){
  l=b=0;
   }
  Box(int x,int y){
     l=x;
     b=y;
    }
  Box(int a){
   l=b=a;
    }
  int area(){
    return l*b;
    }
}

class BoxArea{
 public static void main(String args[]){
      Box B1= new Box();
      Box B2= new Box(10,10);
      Box B3= new Box(40);
      System.out.println("Area="+B2.area());
      System.out.println("Area="+B3.area());
   }
 }    
  
