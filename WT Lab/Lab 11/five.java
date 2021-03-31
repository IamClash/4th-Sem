import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class five extends Applet implements ActionListener 
{ 
    Label l = new Label("Enter Number");
    TextField t = new TextField(10);
    Button b = new Button("Find");
    TextField out = new TextField(10);
    public void init()  
    {
        setLayout(null);
        l.setBounds(10,10,80,20);
        add(l);
        t.setBounds(100,10,80,20);
        add(t);
        b.setBounds(10,40,80,20);
        add(b);
        b.addActionListener(this);
        out.setBounds(10,80,80,20);
        add(out);
    }
    public void actionPerformed(ActionEvent e)  
    {
        if (e.getSource() == b)
        {
            if(t.getText().equals(""))
                out.setText("Empty Field");
            else
            {
                int n = Integer.parseInt(t.getText());
                if( n % 2 == 0)
                    out.setText(n+" is even");
                else
                    out.setText(n+" is odd");
            }
        }
    }
}
/* <applet code="five" width="190" height="110"> </applet> */