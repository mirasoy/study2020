package chapter7;


import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class N01 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("정수-1이 입력될떄까지>>");
		Vector<Integer> v = new Vector<>();
		while(true){
			int j = sc.nextInt();
			v.add(j);
			if(j==-1){break;}
						
		}
		System.out.println(Collections.max(v));
		
	}
}
	
	