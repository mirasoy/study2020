package ch6Q;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		String str = new String(sc.nextLine());
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);

		while (true) {
try{
			System.out.print("��� :  ");
			String order = sc.nextLine();
			if (order.equals("�׸�")) {
				System.exit(0);
			}
			StringTokenizer st = new StringTokenizer(order, "!");
			String s1 = st.nextToken();
			String s2 = st.nextToken();

			sb.replace(sb.indexOf(s1), sb.indexOf(s1) + s1.length(), s2);

			System.out.println(sb);}
catch(StringIndexOutOfBoundsException e){
	System.out.println("��ã��");
}catch(NoSuchElementException e){
	System.out.println("�߸��ȸ�ɾ�!");
}
		}
	}
}
