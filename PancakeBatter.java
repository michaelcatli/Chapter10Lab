import java.awt.*;
import java.applet.*;
import java.util.*;

public class PancakeBatter{
  int x;
  int y;
  int d;
  boolean butter;
  public PancakeBatter(){
    x=0;
    y=0;
    butter = false;
  }
  public PancakeBatter(int a, int b ,int diam,boolean bo){
    x=a;y=b;d=diam;butter=bo;
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
    g.fillOval(x,y,d,d);
  }else{
    g.setColor(new Color(225,227,117));
    g.fillOval(x,y,d,d);

  }
}
}
