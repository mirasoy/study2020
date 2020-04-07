package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public Location(String name, int w, int g) {
		super();
		this.name = name;
		this.w = w;
		this.g = g;
	}
	int w;
	int g;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"  "+w+"  "+g+"\n";
	}
	
	
}
public class N06 {
public static void main(String[] args) {
	HashMap<String, Location> hs = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	
	
	System.out.println("도시 경도 위도를 입력하세요.");
	
	
	for (int i = 0; i < 4; i++) {
		System.out.print(">>");
	
		
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, ", ");

		String name = (String) st.nextElement();
		int w = Integer.parseInt((String) st.nextElement());
		int g = Integer.parseInt((String) st.nextElement());
		Location e = new Location(name, w, g);
		hs.put(name, e);
	}
	
	Set<String> sj = hs.keySet();
	Iterator<String> it = sj.iterator();
	while(it.hasNext()){
	String key = it.next();
	System.out.println(hs.get(key).toString());
	}
	
	
	
	while(true){
		
		try{System.out.print("도시이름 >>");
		String name = sc.nextLine();
			
		if(name.equals("그만")){break;}
		System.out.println(	hs.get(name).toString());
		}catch(NullPointerException e){
			System.out.println("없는도시");		}
			
		
	}
	
	
	
}
}
