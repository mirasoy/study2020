package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class N08 {
public static void main(String[] args) {
	HashMap<String, Integer> point = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("포인트관리시스템");
	while(true){
		System.out.print("이름과 포인트 입력 >>");
		String name  = sc.next();
		if(name.equals("그만")){break;}
		int pt = sc.nextInt();
		if(point.get(name)==null){	
		point.put(name, pt);}
		else{
			point.put(name,point.get(name)+pt);
			
		}
		
		
		
		Set<String> sj = point.keySet();
		Iterator<String> it = sj.iterator();
		while(it.hasNext()){
		String key = it.next();
		System.out.print("("+key +", "+ point.get(key)+")" );
		}System.out.println();
		
		
		
	}
}

}
