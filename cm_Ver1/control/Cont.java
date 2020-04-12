package control;

import javax.swing.JOptionPane;

import model.Dao;
import model.Dto;

import java.util.Vector;

import view.view;
public class Cont extends view {

	
	Dao dao = Dao.getIns(); 
	
	
	public Cont() {
	
	}

	public void input(String[] newone) {

		Dto dto = new Dto();
		
		dto.setMail(newone[0]);
		dto.setName(newone[1]);
		dto.setPhone(newone[2]);
		
		dao.input(dto);
		
		
		
		
	}

	public String[] output() {
		
		String[] arr = dao.outputinfo();
		return arr;
		
		
	}


	public Vector<String[]> search(String name) {
		Vector<String[]> searchresult = new Vector<String[]>(); 
		
		searchresult = dao.Search(name);
		
		return searchresult;
	}

	public void delete(int index) {
		dao.delete(index);
		
	}

}
