package ch08;

import java.io.File;

public class N9 {
public static void main(String[] args) {
	
	
	File newf = new File("E:\\MR\\j");
	File[] all = newf.listFiles();
	
	int i =0;
	for(File f:all){
		
		if(0<(f.getName().lastIndexOf(".txt"))){
			System.out.println(f.getName()+"삭제");
			f.delete();
			i++;
			
		}
//		
	}
	
	System.out.println("총 "+i+"개의 파일 삭제");
	
	
}
}
