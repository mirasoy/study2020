package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2 {
public static void main(String[] args) throws IOException {
	

	
	FileInputStream fis = new FileInputStream("E:\\MR\\phone.txt");
	
	int c;
	while ((c=fis.read())!= -1){
		System.out.print((char)c);
		
	}
	fis.close();
	
	
	
	
	
	
	
}

}
