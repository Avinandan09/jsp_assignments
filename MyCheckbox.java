
import java.applet.*;
import java.awt.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;

/**
 *
 * @author SOMEN
 */
public class MyCheckbox extends Applet implements ItemListener {

    String msg="Checkbox options";
    Checkbox cb1,cb2;
    Button b1,b2;
    public void init()
    {
        setFont(new Font("Cosmic Sans", Font.PLAIN, 14));
        setBackground(Color.cyan);
        setForeground(Color.black);
        b1=new Button("Demo Button1");
        b2=new Button("Demo Button2");
        cb1=new Checkbox("Bold");
        cb2=new Checkbox("Italic");
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        add(cb1);
        add(cb2);
        add(b1);
        add(b2);
    }
    public void itemStateChanged(ItemEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
    int b,i;
    b=(cb1.getState()? Font.BOLD:Font.PLAIN);
    i=(cb2.getState()?Font.ITALIC:Font.PLAIN);
    start();
    b1.setFont(new Font("Cosmic Sans", b+i, b+i*10));
    b2.setFont(new Font("Cosmic Sans", b+i, 14));
    repaint();
    
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 100,200);
    }
    

}
