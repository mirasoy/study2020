package ch6Q;

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();

		for (int i = 0; i < s.length()+1; i++) {
			StringBuffer s1 = new StringBuffer(s);
			StringBuffer s2 = new StringBuffer(s);
			s1.delete(0, i);
			 s2.delete(i, s.length());
			s1.append(s2);

			System.out.println(s1);
		}

	}
}
