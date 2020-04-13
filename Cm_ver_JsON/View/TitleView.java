package View;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		init();
	
	}

	@Override
	public void init() {
		// 레이아웃잡는부분
		
		JLabel title =  new JLabel("고객관리시스템");
		this.add(title); //w제이페ㅇ널의 에드를 사용

		title.setFont(new Font("나눔고딕",Font.BOLD,30));
		
		

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
