//package java100;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Cal extends Frame {

	Button b0 = new Button("0");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	Button add = new Button("+");
	Button sub = new Button("-");
	Button mult = new Button("*");
	Button mo = new Button("/");
	Button re = new Button("=");

	Panel p1 = new Panel(new GridLayout(1, 1));
	Panel p2 = new Panel(new GridLayout(1, 4));
	Panel p3 = new Panel(new GridLayout(1, 4));
	Panel p4 = new Panel(new GridLayout(1, 4));
	Panel p5 = new Panel(new GridLayout(1, 4));
	Panel p6 = new Panel(new GridLayout(1, 2));

	Label lb = new Label();

	public Cal() {

		setSize(400, 600);
		setLayout(new GridLayout(5, 1));
		lb.setBackground(Color.gray);

		add(p1);
		p1.add(lb);
		add(p2);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(add);
		add(p3);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(sub);
		add(p4);
		p4.add(b7);
		p4.add(b8);
		p4.add(b9);
		p4.add(mult);
		add(p5);
		p5.add(b0);
		p5.add(p6);
		p6.add(re);
		p6.add(mo);

		play();

		setVisible(true);
	}

	public void play() {
		ButtonHd bh = new ButtonHd();
		b0.addActionListener(bh);
		b1.addActionListener(bh);
		b2.addActionListener(bh);
		b3.addActionListener(bh);
		b4.addActionListener(bh);
		b5.addActionListener(bh);
		b6.addActionListener(bh);
		b7.addActionListener(bh);
		b8.addActionListener(bh);
		b9.addActionListener(bh);

		add.addActionListener(bh);
		sub.addActionListener(bh);
		mult.addActionListener(bh);
		mo.addActionListener(bh);
		re.addActionListener(bh);
		
	}

	public static void main(String[] args) {
		new Cal();

	}
	
//	
//	ArrayList<Integer> intAr =  new ArrayList<Integer>();
//	ArrayList<String> symAr =  new ArrayList<String>();
//	ArrayList<String> screan =  new ArrayList<String>();
	
	
}
class data{
	ArrayList<Integer> intAr =  new ArrayList<Integer>();
	ArrayList<String> symAr =  new ArrayList<String>();
	ArrayList<String> screan =  new ArrayList<String>();
}
class ButtonHd implements ActionListener {

	String scr = "";
	data cal = new data();
	
	
	public void actionPerformed(ActionEvent e) {
		Button b = null;
		if (e.getSource() instanceof Button) {
			b = (Button) e.getSource();
		}
		
		String st = b.getLabel();
		System.out.println(st);
		cal.screan.add(st);
		
		
		System.out.println(cal.screan.size());
		try {
			int i = Integer.parseInt(st);
			cal.intAr.add(i);
		} catch (NumberFormatException e1) {
			cal.symAr.add(st);
			
		}
		finally{
			
			
			for(String s:cal.screan) {
				scr+=s;
			}
			symbol();
			
			
		}
	}

	private void symbol() {
		System.out.println(scr);
		Cal cals = new Cal();
		cals.lb.setText(scr);
	}

}

