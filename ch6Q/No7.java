package ch6Q;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "";

		while (true) {
			System.out.print(">>");
			s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int n = st.countTokens();
			
			if(s.equals("그만")){System.out.println("bye~");break;}
			System.out.println("어절갯수는 " + n);
		}

	}
}
