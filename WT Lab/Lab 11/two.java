import java.applet.*; 
import java.awt.*; 
public class two extends Applet 
{ 
    public void paint(Graphics g) 
    { 
        g.setColor(Color.yellow);
        g.fillOval(20,20,150,150);
        g.setColor(Color.black);
        g.fillOval(50,60,15,25);
        g.fillOval(120,60,15,25); 
        g.drawArc(55,95,78,50,0,-180);
    } 
}
/* <applet code="two" width="200" height="180"> </applet> */