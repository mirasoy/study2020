package ch08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class N11 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		
		FileReader fin = new FileReader("E:\\MR\\words.txt");
		BufferedReader br = new BufferedReader(fin);

		
		String line = null;
		
		Vector<String> wd = new Vector<>();
		while ((line = br.readLine()) != null) {
			wd.add(line);
		}
		System.out.println("입력");
		String input = sc.nextLine();
		for(String s : wd){
			
			int size = input.length();
			for(int i = 0 ; i < size ; i++){
				
				
				
			}
			
			
			
		}

		
		
		
		
	}
	
	
	
	
}
