package chapter7;

import java.util.HashMap;
import java.util.Scanner;

public class N03 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	HashMap<String, Integer> nations = new HashMap<>();
	
	System.out.println("나라 이름과 인구를 입력하세요  예:korea 5000");

	
	
	while(true){
		System.out.print("나라이름, 인구 >>");
	String name = sc.next();
	if(name.equals("그만")){break;}
	int pp = sc.nextInt();
	nations.put(name, pp);
	}
	
	while(true){
	System.out.print("인구검색 >> ");
	String name = sc.next();
	if(name.equals("그만")){break;}
	System.out.println(nations.get(name));
	}
	
	
	
	
}
}
