package View;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Resources.R.*;

public class InputView extends View {

	JPanel base = new JPanel(new GridLayout(5,1));
	
	JPanel in1 = new JPanel(); 
	JPanel in2 = new JPanel();
	JPanel in3 = new JPanel();
	JPanel in4 = new JPanel();
	public InputView() {
		init();
	}

	@Override
	public void init() {
		
		base.add(in1);
		base.add(in2);
		base.add(in3);
		base.add(in4);
		
		JLabel lb1 =  new JLabel("이름       ");
		JLabel lb2 =  new JLabel("이메일    ");
		JLabel lb3 =  new JLabel("전화번호");
		
		
		in1.add(lb1);
		in1.add(nameField);
		in2.add(lb2);
		in2.add(mailField);
		in3.add(lb3);
		in3.add(phoneField);
		
//		nameField.setEnabled(false);
//		mailField.setEnabled(false);
//		phoneField.setEnabled(false);
//		
//		nameField.setBackground(Color.gray);
//		mailField.setBackground(Color.gray);
//		phoneField.setBackground(Color.gray);
//		
		
		add(base);
		
		
		
	}

	@Override
	public void start() {
		nameField.setEnabled(true);
		mailField.setEnabled(true);
		phoneField.setEnabled(true);
		nameField.setBackground(Color.WHITE);
		mailField.setBackground(Color.WHITE);
		phoneField.setBackground(Color.WHITE);
		
	
	}
	public void end() {
		nameField.setEnabled(false);
		mailField.setEnabled(false);
		phoneField.setEnabled(false);
		
		nameField.setBackground(Color.gray);
		mailField.setBackground(Color.gray);
		phoneField.setBackground(Color.gray);
	}

}
