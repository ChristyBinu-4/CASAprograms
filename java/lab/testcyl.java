import java.util.Scanner;
class Cylinder
{
  float r,h;
  void read(float x,float y)
   {
     r=x;
     h=y;
   }
  float area()
   {
      return 2*3.14f*r*(r+h);
   }
  float volume()
  {
    return 3.14f*r*r*h;
  }
  void disp()
  {
    System.out.println("Area="+area()+"\nVolume="+volume());
  }
}
class Testcyl
{
  public static void main(String args[])
  {
    float x,y;
    Scanner S=new Scanner(System.in);
    System.out.println("Enter radius and height:");
    x=S.nextFloat();
    y=S.nextFloat();
    Cylinder C=new Cylinder();
    C.read(x,y);
    C.disp();
}
}