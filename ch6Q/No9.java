package ch6Q;

import java.util.Scanner;

public class No9 {
	public static String s(int a){
		switch(a){
		case 1 : return "가위";
		case 2 : return "바위";
		case 3 : return "보";
		default : return "잘못냈다!";
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("철수 [1.가위 2.바위 3.보 4.끝내기]");
			int u = sc.nextInt();
			int com = (int) (Math.random() * 3) + 1;

	
			
			System.out.println("유져("+s(u)+")"+": 컴터("+s(com)+")");

			switch (u) {
			case 1:
				if (com == 1) {
					System.out.println("비겼다");
				}
				if (com == 2) {
					System.out.println("컴터가 이겻다");
				}
				if (com == 3) {
					System.out.println("니가 이겼다!");
				}

				break;

			case 2:
				if (com == 2) {
					System.out.println("비겼다");
				}
				if (com == 3) {
					System.out.println("컴터가 이겻다");
				}
				if (com == 1) {
					System.out.println("니가 이겼다!");
				}

				break;

			case 3:
				if (com == 3) {
					System.out.println("비겼다");
				}
				if (com == 1) {
					System.out.println("컴터가 이겻다");
				}
				if (com == 2) {
					System.out.println("니가 이겼다!");
				}

				break;
			case 4:
				System.out.println("bye");
				System.exit(0);
			}

		}

	}
}
