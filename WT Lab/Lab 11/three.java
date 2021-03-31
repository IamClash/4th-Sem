import java.applet.*;
import java.awt.*;
public class three extends Applet
{
    public void init()
    {
        setLayout(null);
        Label l=new Label("This is a label");
        l.setBounds(10,10,120,30);
        add(l);
        TextField t=new TextField("This is a text field");
        t.setBounds(10,50,120,30);
        add(t);
        TextArea ta=new TextArea("This is a text area");
        ta.setBounds(10,90,150,120);
        add(ta);
        Checkbox c = new Checkbox("This is a checkbox with default value true", true); 
        c.setBounds(10,220,240,30);
        add(c);
        CheckboxGroup ch = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("This is very similar to Radio Button", ch, false);    
        ch1.setBounds(10,260,420,30);
        Checkbox ch2 = new Checkbox("Since Radio Button is absent in AWT, CheckboxGroup is used", ch, false);    
        ch2.setBounds(10,280,420,30);
        Checkbox ch3 = new Checkbox("By default the value of this checkbox is true and the above two are false", ch, true);    
        ch3.setBounds(10,300,420,30);
        add(ch1);
        add(ch2);
        add(ch3);
        Button b = new Button("This is a button");
        b.setBounds(10,340,120,30);
        add(b);
    }
}
/* <applet code="three" width="430" height="380"> </applet> */