package ch08;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class N8 {
public static void main(String[] args) {

	File newf = new File("c:\\");
	File[] all = newf.listFiles();
	
	ArrayList<Long> size = new ArrayList<>();
	ArrayList<String> name = new ArrayList<>();
	
	for(File f : all ){
		
		size.add(f.length());
		name.add(f.getName());
		
	}

	int idx = size.indexOf(Collections.max(size));
	System.out.println("가장 큰 파일은 "+name.get(idx)+" "+Collections.max(size)+"바이트");
	
	
}
}
