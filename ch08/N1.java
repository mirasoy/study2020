package ch08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class N1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호입력프로그램");
		
		
		ArrayList<String> ph = new ArrayList<>();
		while(true){
			String a = sc.nextLine();
			if (a.equals("그만")) {
				break;
			}
			ph.add(a);
			
		}
		sc.nextLine();
		FileWriter fw = new FileWriter("E:\\MR\\phone.txt");
	
		String line = sc.nextLine();
		
		for(String s : ph){
			String st = s;
			
			fw.write(st);
			fw.write("\r\n");
			
			
		}
		
		fw.close();		
		System.out.println("E:\\MR\\phone.txt 에 저장ㅎ");
		
		
		
	}
}
