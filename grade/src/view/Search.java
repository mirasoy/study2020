package view;

import static res.R.m;

import model.Gmodel;

public class Search implements View {

	@Override
	public void display() {
		m("��������������������" + menulist[(int) dt.get("no")] + "��������������������");
		
				
		m("ã���� �̸��� �Է��ϼ���");
		dt.put("name", sc.next());
		
		
		
		
		
		
		
	}

	public void display2() {

		Gmodel[] m = (Gmodel[]) dt.get("arr");

		for (int i = 0; i < m.length; i++) {
			m(m[i].toString());}
		
		
	}

}
