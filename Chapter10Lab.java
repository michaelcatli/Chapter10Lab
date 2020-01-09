import java.awt.*;
import java.applet.*;
import java.util.*;
public class Chapter10Lab extends Applet{
  public void paint(Graphics g){
    //Main method
    g.drawRect(0,0,600,600);
    PancakeBatter pancake1 = new PancakeBatter(200,200,50,true);
    ChocolateChip pancake2 = new ChocolateChip(300,300,300,false);
    StrawberryPancake pancake3 = new StrawberryPancake(100,100,80,true);
    pancake1.makePancake(g);
    pancake2.makePancake(g);
    pancake3.makePancake(g);
  }

}
