package View;

import static Resources.R.inputcont;
import static Resources.R.listcont;
import static Resources.R.reset;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import EventHandler.BteveHandler;
import Resources.R.*;

public class ButtonView extends View {

	public JButton allB = new JButton("전체보기");
	public JButton inputB = new JButton("추가");
	public JButton delB = new JButton("삭제");
	public JButton searchB = new JButton("검색");
	public JButton cancleB = new JButton("취소");
	boolean flag = true;
	public ButtonView() {
		init();
	}

	@Override
	public void init() {

		add(allB);
		add(inputB);
		add(delB);
		add(searchB);
		add(cancleB);

		start();

	}

	@Override
	public void start() {
		BteveHandler bh = new BteveHandler(this);
		allB.addActionListener(bh);

		delB.addActionListener(bh);
		searchB.addActionListener(bh);
		cancleB.addActionListener(bh);
		inputB.addActionListener(bh);
			
		

	}
	

}
