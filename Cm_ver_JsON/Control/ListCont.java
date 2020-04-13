package Control;

import java.util.Vector;

public class ListCont implements Controller {

	public ListCont() {

	}

	@Override
	public void service() {
		Vector<Vector> datalist = dao.selctAll();
		
		
		if (datalist != null) {
			while (dm.getRowCount() > 0) {
				dm.removeRow(0);
			}

			for (Vector v : datalist) {
				dm.addRow(v);
			}
		}else System.out.println("데이터없음");

	}

	public void test() {

		Vector rowData = new Vector<>();
		rowData.add(0);
		rowData.add("mira");
		rowData.add("mail@mail.com");
		rowData.add("01023992252");

	}

}
