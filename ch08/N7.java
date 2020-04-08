package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class N7 {
	public static void main(String[] args) throws IOException {

		File f = new File("E:\\MR\\a.jpg");
		File f2 = new File("E:\\MR\\b.jpg");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);
		
		int c;
		long size = f.length();
		long s10 = (long) (size/10.0);
		while((c=fis.read())!=-1){
			fos.write((byte)c);
			if(f2.length()%s10==0){
				System.out.print("*");
			};
			
		}
		
		
		
		
	}
}
