package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;


public class Dao {
	private Vector<Dto> dv = new Vector<>();
	private File client = new File("C:\\Users\\user\\Desktop\\client.txt");
//	private int idx = 0;
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
//위에 싱글톤 선언부 

	
	//여기는 벡터를 텍스트 파일 기반으로 새로 셋팅해주는 부분
	void setting() {
		dv.clear();
		Vector<String> ob = new Vector<String>();

		String line = null;
		try {
			FileReader reader = new FileReader(client);
			BufferedReader bfReader = new BufferedReader(reader);

			while ((line = bfReader.readLine()) != null) {
				ob.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String s : ob) {
			String[] addlist = s.split(",");

			Dto one = new Dto();

			one.setIdx(Integer.parseInt(addlist[0]));
			one.setName(addlist[1]);
			one.setMail(addlist[2]);
			one.setPhone(addlist[3]);
			dv.add(one);
		}

	}

	// 여기부터 입력받았을떄 작동하는 부분
	public void input(Dto newone) {
		setting();
		try {

			
			newone.setIdx(dv.size()+1);
			dv.add(newone);
			
			FileWriter writer = new FileWriter(client, true);
			writer.write(newone.toString() + "\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//출력하는 부분
	public String[] outputinfo() {
		setting();
		Vector<String> cInfo = new Vector<String>();

		try {
			FileReader reader = new FileReader(client);
			BufferedReader bfReader = new BufferedReader(reader);

			String line = null;
			try {
				while ((line = bfReader.readLine()) != null) {

					cInfo.add(line);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] sArr = new String[cInfo.size()];
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = cInfo.get(i);
		}

		return sArr;
	}
	
	
	//찾아서 스트링배열로 넘겨줌 
	public Vector<String[]> Search(String name) {
		setting();
		Vector<Dto> someone = new Vector<Dto>();
		Vector<String[]> searchresult = new Vector<String[]>();
		someone.clear();
		for (Dto one : dv) {
			if (one.getName().equalsIgnoreCase(name)) {
				Dto some = one;

				someone.add(some);

			}
		}

		for (Dto d : someone) {

			String[] result = d.toString().split(",");
			searchresult.add(result);

		}

		return searchresult;

	}
	
	
	//삭제하는 부분
	public void delete(int index) {

		setting();
		for(int i = 0 ; i < dv.size() ; i++) {
			
			if(dv.get(i).getIdx()==index)
			{
				dv.remove(i);
			}
			
		}
		

		try {
			FileWriter writer = new FileWriter(client);
			for (Dto one : dv) {
				writer.write(one.toString() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
