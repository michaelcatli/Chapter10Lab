import java.awt.*;
import java.applet.*;
import java.util.*;
import java.util.Random;

public class StrawberryPancake extends PancakeBatter{
  public StrawberryPancake(int a1, int b1, int d2, boolean boo){
    x=a1;y=b1;d=d2;butter=boo;
  }
  public void makePancake(Graphics g){
    super.makePancake(g);
    int r = (int)(d/2);
    g.setColor(new Color(232,91,91));
    int xendToBound = (int)((3*r)/4);
    int xBoundLeft = x + xendToBound;
    int xdistanceToRightBound = (int)(r/2);
    int xBoundRight = xBoundLeft + xdistanceToRightBound;

    int yTopEndToBound = (int)((3*r)/4);
    int yBoundTop = y + yTopEndToBound;
    int ydistanceToBottomBound = (int)(r/2);
    int yBoundBottom = yBoundTop + ydistanceToBottomBound;
    int StrawberrySize = (int)(r/14);
    int xRandom;int yRandom;
    for (int k=1; k<=10; k++){
      xRandom = (int)(Math.random()*(xBoundRight - xBoundLeft + 1)) + xBoundLeft;
      yRandom = (int)(Math.random()*(yBoundBottom - yBoundTop + 1)) + yBoundTop;
      g.fillOval(xRandom,yRandom,StrawberrySize,StrawberrySize);
    }
  }
}
