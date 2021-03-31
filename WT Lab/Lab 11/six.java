import java.applet.*; 
import java.awt.*; 
public class six extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.red);
        g.drawRect(10, 10, 80, 50);
        g.setColor(Color.blue);
        g.fillRect(10, 10, 80, 50);
        g.drawRoundRect(10,80,100,50,10,10);
        g.setColor(Color.green);
        g.fillRoundRect(10,80,100,50,10,10);
        g.draw3DRect(10,150,120,50,true);
        g.setColor(Color.yellow);
        g.fill3DRect(10,150,120,50,true);
    }
}
/* <applet code="six" width="180" height="210"> </applet> */