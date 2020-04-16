package View;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Resources.R;

public class MainFrame extends JFrame implements R{
	JPanel content = null;
	
	public MainFrame() {
		
		content = (JPanel) getContentPane();
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(BorderLayout.NORTH,new TitleView());
		add(BorderLayout.CENTER,listview);
		add(BorderLayout.WEST,new InputView());
		add(BorderLayout.SOUTH,new ButtonView());
		setSize(750,550);
		setVisible(true);
		
				
	}

}
