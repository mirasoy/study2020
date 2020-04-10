package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;

import model.Dto;
import re.Res;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Screan implements Res {

	protected JFrame frame;
	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	protected JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screan window = new Screan();
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
	public Screan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 707, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbll = new JLabel("번호");
		lbll.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
		lbll.setForeground(UIManager.getColor("Button.background"));
		lbll.setBounds(36, 72, 57, 15);
		frame.getContentPane().add(lbll);

		JLabel label_1 = new JLabel("이름");
		label_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
		label_1.setForeground(UIManager.getColor("Button.background"));
		label_1.setBounds(36, 117, 57, 15);
		frame.getContentPane().add(label_1);

		JLabel lblL = new JLabel("이메일");
		lblL.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
		lblL.setForeground(UIManager.getColor("Button.background"));
		lblL.setBounds(36, 161, 57, 15);
		frame.getContentPane().add(lblL);

		JLabel label_3 = new JLabel("전화번호");
		label_3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
		label_3.setForeground(UIManager.getColor("Button.background"));
		label_3.setBounds(36, 203, 57, 15);
		frame.getContentPane().add(label_3);

		textField = new JTextField();
		textField.setBounds(105, 69, 191, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 114, 191, 21);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 158, 191, 21);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(105, 200, 191, 21);
		frame.getContentPane().add(textField_3);

		JButton button = new JButton("전체보기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ctn.output();
				
				
			}
		});
		button.setBounds(34, 271, 97, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("추가");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int idx = (Integer.parseInt(textField.getText()));
				
				String name =textField_1.getText();
				String mail = textField_2.getText();
				String phone = textField_3.getText();
				Dto newone = new Dto();
				
				
				newone.setIdx(idx);
				newone.setMail(mail);
				newone.setName(name);
				newone.setPhone(phone);
				
				System.out.println(newone.toString());
				
				ctn.input(newone);
//				textField.setText("");
//				textField_1.setText("");
//				textField_2.setText("");
				textField_3.setText("");

			}
		});
		button_1.setBounds(165, 271, 97, 23);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("삭제");
		button_2.setBounds(296, 271, 97, 23);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("검색");
		button_3.setBounds(427, 271, 97, 23);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("취소");
		button_4.setBounds(558, 271, 97, 23);
		frame.getContentPane().add(button_4);

		table = new JTable();
		table.setBounds(314, 68, 348, 152);
		frame.getContentPane().add(table);

		JLabel label = new JLabel("고객관리시스템");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 26));
		label.setForeground(UIManager.getColor("Button.highlight"));
		label.setBounds(218, 10, 253, 42);
		frame.getContentPane().add(label);
	}
}
