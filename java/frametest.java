import java.awt.*;

class frametest extends Frame{
 Firstframe(){
  button b=new button("click me");
  setSize(300,300);
  add(b);
  setlayout(null);
  setVisiblity(true);
  }

  public static void main(string args[]){
  Firstframe f=new Firstframe();
  }
} 