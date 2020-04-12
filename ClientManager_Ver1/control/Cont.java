package control;

import javax.swing.JOptionPane;

import model.Dao;
import model.Dto;

import java.util.Vector;

import view.Screan;
public class Cont extends Screan {

	
	Dao dao = Dao.getIns(); 
	
	
	public Cont() {
	
	}

	public void input(Dto newone) {

		dao.input(newone);
		
		
		
		
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
