/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SOMEN
 */
import java.applet.*;
import java.awt.*;

public class card extends Applet
{
	Panel card_stack;	//panel which holds all cards
	CardLayout c1;

	public void init()
	{
		setLayout(new BorderLayout());
		card_stack=new Panel();
		c1=new CardLayout();
		card_stack.setLayout(c1);
		add("Center",card_stack);

		Panel card1=new Panel();	//initialize 1st card
		card1.setLayout(new FlowLayout());
		card1.add(new Label ("card1"));
		card1.add(new Button("one"));
		card_stack.add("one",card1);	//add 1st card to card 	stack


		Panel card2=new Panel();
		card2.setLayout(new FlowLayout());
		card2.add(new Label ("card2"));
		card2.add(new TextField("two",30));
		card_stack.add("two",card2);

		Panel card3=new Panel();
		card3.setLayout(new FlowLayout());
		card3.add(new Label ("card3"));
		card3.add(new Checkbox("three"));
		card_stack.add("three",card3);

		Panel Button_bar=new Panel();
		Button_bar.setLayout(new FlowLayout());
		Button_bar.add(new Button("FIRST"));
		Button_bar.add(new Button("PREVIOUS"));
		Button_bar.add(new Button("NEXT"));
		Button_bar.add(new Button("LAST"));

		add("South",Button_bar);
	}

	public boolean action(Event evt,Object arg)
	{
		if("FIRST".equals(arg))
			c1.first(card_stack);
		else if("PREVIOUS".equals(arg))
			c1.previous(card_stack);
		else if("NEXT".equals(arg))
			c1.next(card_stack);
		else if("LAST".equals(arg))
			c1.last(card_stack);

		return true;
	}
}



