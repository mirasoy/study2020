package ch08;

import java.io.FileWriter;
import java.io.IOException;

public class Note {
public static void main(String[] args) throws IOException {
	
	
	FileWriter fw = new FileWriter("E:\\MR\\phoneq.txt");
	
	fw.write('c');
	fw.close();
}
}
