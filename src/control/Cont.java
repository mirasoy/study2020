package control;

import javax.swing.JOptionPane;

import model.Dao;
import model.Dto;
import static re.Res.*;
import view.Screan;
public class Cont extends Screan {

	
	Dao dao = Dao.getIns(); 
	
	
	public Cont() {
		new Screan();
	}

	public void input(Dto newone) {

		JOptionPane.showMessageDialog(super.frame, "추가되었습니다");
		dao.input(newone);
		
	}

	public void output() {
		
		
		
		
		
	}

}
