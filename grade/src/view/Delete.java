package view;

import static res.R.m;

import model.Gmodel;

public class Delete implements View {

	@Override
	public void display() {
		m("��������������������" + menulist[(int) dt.get("no")] + "��������������������");
		
		
		
		m("������ no�� �Է����ּ���");
		
		int i = sc.nextInt();

		for (int j = 0; j < ((Gmodel[]) dt.get("arr")).length; j++) {

			if (((Gmodel[]) dt.get("arr"))[j].getIdx() == i) {

				dt.put("idx", i);
				

			}
		}
	}

}
