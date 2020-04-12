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
import javax.swing.table.DefaultTableModel;

import model.Dto;
import re.Res;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class view {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private DefaultTableModel model;
	Object[] col = { "NO", "이름", "이메일", "전화번호" };
	Object[][] col2 = {};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public view() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(300, 300, 707, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

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
				delTable();
				printOut(Res.ctn.output());

			}
		});
		button.setBounds(34, 271, 97, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("추가");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delTable();
				sendIf();

			}

		});
		button_1.setBounds(165, 271, 97, 23);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("삭제");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete();
				delTable();
			}

		});
		button_2.setBounds(296, 271, 97, 23);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("검색");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delTable();
				searchScrean();

			}

		});
		button_3.setBounds(427, 271, 97, 23);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("취소");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "종료할까요?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		button_4.setBounds(558, 271, 97, 23);
		frame.getContentPane().add(button_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 68, 348, 152);
		frame.getContentPane().add(scrollPane);

		model = new DefaultTableModel(col2, col);

		table = new JTable(model);
		scrollPane.setViewportView(table);

		JLabel label = new JLabel("고객관리시스템");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 26));
		label.setForeground(UIManager.getColor("Button.highlight"));
		label.setBounds(218, 10, 253, 42);
		frame.getContentPane().add(label);

	}

	public void delTable() {

		int size = model.getRowCount();

		for (int i = 0; i < size; i++) {
			model.removeRow(0);
		}
	}

	public void printOut(String[] ob) {
		for (String s : ob) {
			String[] addlist = s.split(",");
			model.addRow(addlist);
		}

	}

	public void offText() {
		textField_1.setEnabled(false);
		textField_2.setEnabled(false);
		textField_3.setEnabled(false);

	}

	private void sendIf() {

		String name = textField_1.getText();
		String mail = textField_2.getText();
		String phone = textField_3.getText();
		
		
		
		String[] info = {name,mail,phone};
		
		Res.ctn.input(info);
		
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		JOptionPane.showMessageDialog(null, "추가되었습니다");
	}

	public void searchScrean() {
		String name = textField_1.getText();
		Vector<String[]> reList = new Vector<String[]>();
		reList.clear();
		reList = Res.ctn.search(name);
		if (reList.size() != 0) {
			for (String[] resultSearch : reList) {
				model.addRow(resultSearch);
			}
		} else {
			JOptionPane.showMessageDialog(null, "검색결과가 없습니다.");
		}
		textField_1.setText(null);
	}

	public void delete() {
		int row = table.getSelectedRow();
		int index = Integer.parseInt((String) table.getValueAt(row, 0));
		Res.ctn.delete(index);
		JOptionPane.showMessageDialog(null, "삭제되었습니다");
	}
}
