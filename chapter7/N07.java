package chapter7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class N07 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Double> hs = new HashMap<>();
	System.out.println("장학관리시스템.");
	
	
	for (int i = 0; i < 5; i++) {
		System.out.print("이름 학점>>");
		String name = sc.next();
		double grade = sc.nextDouble();
		hs.put(name, grade);
	}
	
	System.out.print("장학금 선발 기준 입력 : ");
	double line = sc.nextDouble();
	ArrayList<String> sn = new ArrayList<>();
	Set<String> sj = hs.keySet();
	Iterator<String> it = sj.iterator();
	while(it.hasNext()){
	String key = it.next();
	if(hs.get(key)>=line){
		sn.add(key);
	}}
	
	System.out.println("장학생 명단" + sn);
	
}

}
