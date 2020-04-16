package View;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View {
	// ioc디자인패턴 (제어의 역전) : 사용할 데이터를 외부에서 생성하고 객체로 입력한다.
//	DefaultTableModel model;

	JTable table;
	DefaultTableModel model;

	
	
	public ListView(DefaultTableModel dm, Object[] colnames) {
		model = dm;
		model.setColumnIdentifiers(colnames);
		init();
	}

	
	
	@Override
	public void init() {
		table = new JTable(dm);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll);
	}

	
	
	@Override
	public void start() {

	}

	public int idxnumber() {
		int row = table.getSelectedRow();
		
		if (row == -1) {
			JOptionPane.showMessageDialog(null, "삭제할 항목을 선택해 주세요");
			return -1;
		}
		int o = (int) table.getValueAt(row, 0);

		return o;

	}

}
