package view;

import static res.R.*;

import model.Gmodel;

public class Input implements View {

	@Override
	public void display() {
		m("��������������������" + menulist[(int) dt.get("no")] + "��������������������");

		Gmodel one = new Gmodel();

		mm("�̸��Է�");
		one.setName(sc.next());
		mm("������Է�");
		
		while(true) {
		int j = sc.nextInt();
		if(j <0 || j >100) {
			m("�߸��� ���� ���� �Դϴ�. �ٽ� �Է����ּ���.");
		}else {one.setKr(j); break;}
		}
		
		
		mm("���м����Է�");
		
		while(true) {
			int j = sc.nextInt();
			if(j <0 || j >100) {
				m("�߸��� ���� ���� �Դϴ�. �ٽ� �Է����ּ���.");
			}else {one.setMath(j); break;}
			}
			
		
		mm("������Է�");

		while(true) {
			int j = sc.nextInt();
			if(j <0 || j >100) {
				m("�߸��� ���� ���� �Դϴ�. �ٽ� �Է����ּ���.");
			}else {one.setEn(j); break;}
			}
			
		
		
		sc.nextLine();
		one.setTotal(one.getEn() + one.getKr() + one.getMath());
		one.setAv((double)(one.getEn() + one.getKr() + one.getMath()) / (double)3.0);

		dt.put("one", one);

	}

}
