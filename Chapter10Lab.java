import java.awt.*;
import java.applet.*;
import java.util.*;
public class Chapter10Lab extends Applet{
  public void paint(Graphics g){
    //Main method
    g.drawRect(0,0,600,600);
    PancakeBatter pancake = new PancakeBatter(30,30,100,true);
    pancake.makePancake(g);
  }

}
