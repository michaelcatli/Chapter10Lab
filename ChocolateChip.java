import java.awt.*;
import java.applet.*;
import java.util.*;
import java.util.Random;

public class ChocolateChip extends PancakeBatter{
    public ChocolateChip(int a, int b, int d1, boolean bol){
      x=a;y=b;d=d1;butter=bol;
    }

    public void makePancake(Graphics g){
      int r = (int)(d/2);

      int xendToBound = (int)((3*r)/4);
      int xBoundLeft = x + xendToBound;
      int xdistanceToRightBound = (int)(r/2);
      int xBoundRight = xBoundLeft + xdistanceToRightBound;

      int yTopEndToBound = (int)((3*r)/4);
      int yBoundTop = y + yTopEndToBound;
      int ydistanceToBottomBound = (int)(r/2);
      int yBoundBottom = yBoundTop + ydistanceToBottomBound;
      int chipsize = (int)(r/14);
      int xRandom;int yRandom;
      super.makePancake(g);
      g.setColor(Color.black);

      for (int k=1; k<=10; k++){
        xRandom = (int)(Math.random()*(xBoundRight - xBoundLeft + 1)) + xBoundLeft;
        yRandom = (int)(Math.random()*(yBoundBottom - yBoundTop + 1)) + yBoundTop;
        g.fillOval(xRandom,yRandom,chipsize,chipsize);
      }
    }
  }
