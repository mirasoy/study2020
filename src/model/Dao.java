package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import re.Data;

public class Dao {
	private Vector<Dto> dv = new Vector<>();
	private File client = new File("C:\\Users\\user\\Desktop\\client.txt");

	Dao instance;
		
	private Dao() {
	}

	private static Dao daoins;

	public static Dao getIns() {
		if (daoins == null) {

			daoins = new Dao();
		}
		return daoins;
	}
//싱글톤 선언부 
	
	
	//여기부터 입력받았을떄 작동하는 부분
	public void input(Dto newone) {
		try {
			
			dv.add(newone);
			FileWriter writer  =  new FileWriter(client);
		
			for(Dto d : dv){
			writer.write(d.toString()+"\n");
			}
			
			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
