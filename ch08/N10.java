package ch08;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N10 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// InputStream f = new InputStream("E:\\MR\\j\\phone.txt");

		FileReader f = new FileReader("E:\\MR\\j\\phone.txt");
		BufferedReader bf = new BufferedReader(f);
		ArrayList<String> as = new ArrayList<>();

		 String line;
		 while((line = bf.readLine())!=null){
			 as.add(line);
			 
		 }
		 
		 HashMap<String, String> pb = new HashMap<>();
		 
		 
		 
		 for(String s :as){
			 
			 StringTokenizer stk = new StringTokenizer(s," ");
			 String a = stk.nextToken();
			 String b = stk.nextToken();
			 
			 pb.put(a, b);
		 }
		 
		 System.out.println(pb.size()+"개의 번호 있음");
		 while(true){
			 
			 System.out.print("name>");
			 String name = sc.nextLine();
			 if (name.equals("그만")) {
					break;
				}
			 System.out.println(pb.get(name));
			 
		 }

	}

}
