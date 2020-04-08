package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;

public class N3 {
	public static void main(String[] args) throws IOException {
		// FileInputStream fis = new FileInputStream("c:\\windows\\system.ini");
		FileReader fis = new FileReader("c:\\windows\\system.ini");

		int c;
		while ((c = fis.read()) != -1) {
			System.out.print(Character.toUpperCase((char) c));

		}
		fis.close();
	}
}
