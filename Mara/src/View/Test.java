package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Test {

	private JFrame frame;
	private JRadioButton large;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000	, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel leftpanel = new JPanel();
		frame.getContentPane().add(leftpanel);
		
		

		
		JPanel rightpanel_2 = new JPanel();
		JButton nextBt2 = new JButton("다음단계");
		JPanel decoP = new JPanel();
		frame.getContentPane().add(rightpanel_2);

		
		
		
		decoP.setBackground(new Color(178, 34, 34));
		decoP.setBounds(396, 0, 96, 661);
		rightpanel_2.add(decoP);
		rightpanel_2.setBackground(new Color(255, 255, 255));
		rightpanel_2.setLayout(null);
		
		nextBt2.setForeground(new Color(255, 255, 255));
		nextBt2.setBackground(new Color(139, 0, 0));
		nextBt2.setBounds(252, 595, 121, 42);
		rightpanel_2.add(nextBt2);
		
		JLabel lblNewLabel = new JLabel("<html>기본 재료가 포함되어 있는 상태입니다.\r\n<br/>추가하실 옵션을 고르세요. (각 1000원)</html>");
		JLabel lblNewLabel_1 = new JLabel("<html>기본구성 : 청경채, 숙주, 배추, 새송이, 느타리, 목이버섯, 건두부, 푸주, 옥수수면, 중국당면</html>");
		JPanel optionPanel = new JPanel();
		JButton op1 = new JButton("납작당면");
		JButton op2 = new JButton("녹두당면");
		JButton op3 = new JButton("옥수수면");
		JButton op4 = new JButton("청경채");
		JButton op5 = new JButton("콩나물");
		JButton op6 = new JButton("숙주나물");
		JButton op7 = new JButton("배추");
		JButton op8 = new JButton("감자");
		JButton op9 = new JButton("시금치");
		JButton op10 = new JButton("부죽");
		JButton op11 = new JButton("새송이");
		JButton op12 = new JButton("느타리");
		JButton op13 = new JButton("쑥갓");
		JButton op14 = new JButton("새우완자");
		JButton op15 = new JButton("게살완자");
		JButton op16 = new JButton("문어완자");
		JButton op17 = new JButton("메추리알");
		JButton op18 = new JButton("게맛살");
		JButton op19 = new JButton("비엔나");
		JButton op20 = new JButton("얼린두부");
		JButton op21 = new JButton("두유피");
		
		
		
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 16, 361, 58);
		rightpanel_2.add(lblNewLabel);
		
		lblNewLabel_1.setBounds(12, 73, 372, 42);
		rightpanel_2.add(lblNewLabel_1);
		
		optionPanel.setBackground(new Color(255, 255, 255));
		optionPanel.setBounds(0, 118, 397, 362);
		rightpanel_2.add(optionPanel);
		optionPanel.setLayout(null);
		
		op1.setForeground(new Color(255, 255, 255));
		op1.setBackground(new Color(178, 34, 34));
		op1.setBounds(26, 21, 97, 23);
		optionPanel.add(op1);
		
		op2.setForeground(Color.WHITE);
		op2.setBackground(new Color(178, 34, 34));
		op2.setBounds(149, 21, 97, 23);
		optionPanel.add(op2);
		
		op3.setForeground(Color.WHITE);
		op3.setBackground(new Color(178, 34, 34));
		op3.setBounds(272, 21, 97, 23);
		optionPanel.add(op3);
		
		op4.setForeground(Color.WHITE);
		op4.setBackground(new Color(178, 34, 34));
		op4.setBounds(272, 68, 97, 23);
		optionPanel.add(op4);
		
		op5.setForeground(Color.WHITE);
		op5.setBackground(new Color(178, 34, 34));
		op5.setBounds(149, 68, 97, 23);
		optionPanel.add(op5);
		
		op6.setForeground(Color.WHITE);
		op6.setBackground(new Color(178, 34, 34));
		op6.setBounds(26, 68, 97, 23);
		optionPanel.add(op6);
		
		op7.setForeground(Color.WHITE);
		op7.setBackground(new Color(178, 34, 34));
		op7.setBounds(272, 117, 97, 23);
		optionPanel.add(op7);
		
		op8.setForeground(Color.WHITE);
		op8.setBackground(new Color(178, 34, 34));
		op8.setBounds(149, 117, 97, 23);
		optionPanel.add(op8);
		
		op9.setForeground(Color.WHITE);
		op9.setBackground(new Color(178, 34, 34));
		op9.setBounds(26, 117, 97, 23);
		optionPanel.add(op9);
		
		op10.setForeground(Color.WHITE);
		op10.setBackground(new Color(178, 34, 34));
		op10.setBounds(272, 166, 97, 23);
		optionPanel.add(op10);
		
		op11.setForeground(Color.WHITE);
		op11.setBackground(new Color(178, 34, 34));
		op11.setBounds(149, 166, 97, 23);
		optionPanel.add(op11);
		
		op12.setForeground(Color.WHITE);
		op12.setBackground(new Color(178, 34, 34));
		op12.setBounds(26, 166, 97, 23);
		optionPanel.add(op12);
		
		op13.setForeground(Color.WHITE);
		op13.setBackground(new Color(178, 34, 34));
		op13.setBounds(272, 260, 97, 23);
		optionPanel.add(op13);
		
		op14.setForeground(Color.WHITE);
		op14.setBackground(new Color(178, 34, 34));
		op14.setBounds(149, 260, 97, 23);
		optionPanel.add(op14);
		
		op15.setForeground(Color.WHITE);
		op15.setBackground(new Color(178, 34, 34));
		op15.setBounds(149, 211, 97, 23);
		optionPanel.add(op15);
		
		op16.setForeground(Color.WHITE);
		op16.setBackground(new Color(178, 34, 34));
		op16.setBounds(272, 211, 97, 23);
		optionPanel.add(op16);
		
		op17.setForeground(Color.WHITE);
		op17.setBackground(new Color(178, 34, 34));
		op17.setBounds(26, 211, 97, 23);
		optionPanel.add(op17);
		
		op18.setForeground(Color.WHITE);
		op18.setBackground(new Color(178, 34, 34));
		op18.setBounds(26, 260, 97, 23);
		optionPanel.add(op18);
		
		op19.setForeground(Color.WHITE);
		op19.setBackground(new Color(178, 34, 34));
		op19.setBounds(26, 304, 97, 23);
		optionPanel.add(op19);
		
		op20.setForeground(Color.WHITE);
		op20.setBackground(new Color(178, 34, 34));
		op20.setBounds(149, 304, 97, 23);
		optionPanel.add(op20);
		
		op21.setForeground(Color.WHITE);
		op21.setBackground(new Color(178, 34, 34));
		op21.setBounds(272, 304, 97, 23);
		optionPanel.add(op21);
		
		JButton cancel = new JButton("취소");
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(new Color(139, 0, 0));
		cancel.setBounds(51, 595, 121, 42);
		rightpanel_2.add(cancel);
		
		JPanel meetPlusPanel = new JPanel();
		JButton plusbeef = new JButton("소고기");
		JButton pluslamb = new JButton("양고기");
		JLabel lbmeetplus = new JLabel("고기추가 (100g 3000원)");
		
		
		meetPlusPanel.setBounds(0, 490, 397, 67);
		rightpanel_2.add(meetPlusPanel);
		meetPlusPanel.setLayout(null);
		
		plusbeef.setForeground(Color.WHITE);
		plusbeef.setBackground(new Color(178, 34, 34));
		plusbeef.setBounds(91, 34, 97, 23);
		meetPlusPanel.add(plusbeef);
		
		pluslamb.setForeground(Color.WHITE);
		pluslamb.setBackground(new Color(178, 34, 34));
		pluslamb.setBounds(214, 34, 97, 23);
		meetPlusPanel.add(pluslamb);
		
		lbmeetplus.setBounds(132, 10, 155, 15);
		meetPlusPanel.add(lbmeetplus);
		

	}
}
