package Control;

import java.util.Vector;

import javax.swing.JOptionPane;

import Model.Member;

public class SearchCont implements Controller {

	public SearchCont() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {


		String name = JOptionPane.showInputDialog("찾으실이름을입력하세요");
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
