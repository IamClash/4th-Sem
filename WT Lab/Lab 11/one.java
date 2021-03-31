import java.applet.*; 
import java.awt.*; 
public class one extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Name : FirstName LastName",10,20);
        g.drawString("Roll : 190____",10,40);
        g.drawString("Branch : CSE",10,60);
        g.drawString("Section : CS-_",10,80);
    }
}
/* <applet code="one" width="200" height="100"> </applet> */