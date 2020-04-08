package ch08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class N4 {
public static void main(String[] args) throws IOException {

	FileReader fr = new FileReader("c:\\windows\\system.ini");
	BufferedReader br = new BufferedReader(fr);
	ArrayList<String> wd = new ArrayList<>();
	String line = null;
	int i = 1;
	while ((line = br.readLine()) != null) {
		wd.add(line);
	}
	
	for(String s : wd){
		System.out.println(i+": "+s);
		i++;
	}
		
}
//	
//	
//	
//	int c;
//	while ((c=fis.read())!= -1){
//	System.out.print(Character.toUpperCase((char)c));
//		
//	}
//	fis.close();
//}
}
