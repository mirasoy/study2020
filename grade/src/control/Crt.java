package control;

import static res.R.*;

import java.util.InputMismatchException;


public class Crt {

	public void service() {

		dt.put("no", 0);
	
		menu.display();
		try {
			dt.put("no", sc.nextInt());

			switch ((int) dt.get("no")) {

			case 1:

				ip.display();
				dao.inputD();
				break;

			case 2:

				if (dao.empty()) {
					dao.outputD();
					op.display();
				}
				break;

			case 3:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();

				}

				break;

			case 4:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();
					mdf.display();
					dao.modifyD();
				}
				break;

			case 5:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();
					del.display();
					dao.deleteD();
				}
				break;

			case 6:
				if (dao.empty()) {
					dao.makeR();
					dao.outputR();
					al.display();

				}
				break;
			case 7:
				m("�ý����� �����մϴ�");
				System.exit(0);

			default:
				m("�߸����Է��Դϴ�.");
			}
		} catch (InputMismatchException e) {
			m("�߸� �� �Է��Դϴ�.");
			sc.nextLine();
			service();
		}catch (NullPointerException e) {
			m("�߸� �� �Է��Դϴ�.");
			sc.nextLine();
			service();
		}

//			dt.put("no", 0);

		service();
	}

}
