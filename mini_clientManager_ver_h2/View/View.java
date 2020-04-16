package View;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Resources.R;

public abstract class View extends JPanel implements R {
	public abstract void init(); //레이아웃
	public abstract void start(); //이벤트설정

}
