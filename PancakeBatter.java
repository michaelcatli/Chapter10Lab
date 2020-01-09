import java.awt.*;
import java.applet.*;
import java.util.*;

public class PancakeBatter{
  int x;
  int y;
  int r;
  boolean butter;
  public PancakeBatter(){
    x=0;
    y=0;
    butter = false;
  }
  public PancakeBatter(int a, int b ,int rad,boolean g){
    x=a;y=b;r=rad;butter=g;
  }
  public void butterPlease(){
    butter=true;
  }
  public void noButter(){
    butter=false;
  }
  public void makePancake(Graphics g){
    if (butter==true){
    g.setColor(new Color(255,248,197));
    g.fillOval(x,y,r,r);
  }else{
    g.setColor(new Color(225,227,117));
    g.fillOval(x,y,r,r);

  }
}
}
