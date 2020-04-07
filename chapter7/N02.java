package chapter7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> as = new ArrayList<>();
		System.out.print("6개의 학점을 빈칸으로 분리해서 입력 A/B/C/D/F>>");

		for (int i = 0; i < 6; i++) {
			String s = sc.next();
			char ch = s.charAt(0);
			as.add(ch);

		}

		ArrayList<Double> avl = new ArrayList<>();

		for (int i = 0; i < as.size(); i++) {
			switch (as.get(i)) {
			case 'A':
				avl.add(4.0);
				break;
			case 'B':
				avl.add(3.0);
				break;
			case 'C':
				avl.add(2.0);
				break;
			case 'D':
				avl.add(1.0);
				break;
			case 'F':
				avl.add(0.0);
				break;

			default:
				System.out.println("잘못된입력입니다.");
				main(null);
			}

		}
		double ava = 0;

		for (Double d : avl) {
			ava += d;
		}

		System.out.println(ava / as.size());

	}
}
