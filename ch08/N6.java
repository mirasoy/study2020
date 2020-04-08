package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class N6 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("1번파일명 입력");
		String file1 = sc.nextLine();
		System.out.println("2번파일명 입력");
		String file2 = sc.nextLine();

		FileInputStream fis = new FileInputStream("E:\\MR\\" + file1);
	
		
		FileWriter fw = new FileWriter("E:\\MR\\append.txt");
		
		
		
		int a;
		ArrayList<String> ac = new ArrayList<>();
		while((a=fis.read())!=-1){
			ac.add(Character.toString((char)a));
			
		}
		
		for(String s : ac){
			fw.write(s);
		}
		
		fw.close();
		
		
		FileInputStream fis2 = new FileInputStream("E:\\MR\\" + file2);
		FileWriter fw2 = new FileWriter("E:\\MR\\append.txt",true);
		
		
		int a2;
		ArrayList<String> ac2 = new ArrayList<>();
		while((a2=fis2.read())!=-1){
			ac2.add(Character.toString((char)a2));
			
		}
		
		for(String s : ac2){
			fw2.write(s);
		}
		
		fw2.close();
		
		
	}
}
