package view;

import static res.R.m;

import model.Gmodel;

public class Modify implements View {

	@Override
	public void display() {

		m("��������������������" + menulist[(int) dt.get("no")] + "��������������������");
		m("������ no�� �Է����ּ���");
		int i = sc.nextInt();

		for (int j = 0; j < ((Gmodel[]) dt.get("arr")).length; j++) {

			if (((Gmodel[]) dt.get("arr"))[j].getIdx() == i) {

				dt.put("idx", i);

				m("������ ���븦 �Է����ּ���");
				m("1.�̸�  2.�������� 3.�������� 4.�������� ");
				dt.put("mdfno", sc.nextInt());

			}
		}

	}

}
