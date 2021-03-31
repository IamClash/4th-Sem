import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class nine extends Applet implements ActionListener
{  
    Button red = new Button("RED"); 
    Button blue = new Button("BLUE");  
    TextField out = new TextField(10);
    public void init()
    {
        setLayout(null);
        red.setBounds(10,10,50,20);
        red.setBackground(Color.red);
        add(red);
        red.addActionListener(this);
        blue.setBounds(80,10,50,20);
        blue.setBackground(Color.blue);
        add(blue);
        blue.addActionListener(this);
        out.setBounds(10,40,140,20); add(out);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == red || e.getSource() == blue)
            out.setText("You have pressed "+e.getActionCommand());
    }
}
/* <applet code="nine" width="160" height="60"> </applet> */