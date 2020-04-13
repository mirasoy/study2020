package Control;

import java.util.Vector;

import javax.swing.JOptionPane;

public class SearchCont implements Controller {

	public SearchCont() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {

		
		String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
		

		Vector<Vector> datalist = dao.search(name);

		
		if (datalist != null) {
			while (dm.getRowCount() > 0) {
				dm.removeRow(0);
			}

			for (Vector v : datalist) {
				dm.addRow(v);
			}
		} 
		if(datalist.size()==0){
			JOptionPane.showMessageDialog(null, "데이타 ㄴㄴ");}
	}

}
