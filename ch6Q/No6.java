package ch6Q;

import java.util.Calendar;
import java.util.Scanner;

public class No6 {

	public static int game() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Calendar cl = Calendar.getInstance();
		int i = cl.get(Calendar.SECOND);
		System.out.println("현제 초 시간" + i);
		return i;

	}

	public static int result(int a1, int a2) {
		int a;
		if (a1 > a2) {
			a = a2 + 60 - a1;
		} else
			a = a2 - a1;

		return a;
	}

	public static void main(String[] args) {

		System.out.println("10초에 가까운사람이 이기는 게임입니다.");
		System.out.print("황기태시작 엔터키를누르세요");
		int a1 = game();
		System.out.print("10초 예상 후  엔터키를누르세요");
		int a2 = game();
		System.out.print("이재문 시작 엔터키를누르세요");
		int b1 = game();
		System.out.print("10초 예상 후  엔터키를누르세요");
		int b2 = game();

		if (Math.abs(result(a1, a2)- 10) > Math.abs(result(b1, b2)- 10)) {

			System.out.println("황기태의 결과 " + result(a1, a2) + ", 이재문의 결과 " + result(b1, b2) + " 승자는  이재문");
		} else {
			if ((Math.abs(result(a1, a2)- 10) == Math.abs(result(b1, b2)- 10))) {
				System.out.println("황기태의 결과 " + result(a1, a2) + ", 이재문의 결과 " + result(b1, b2) + " 무승부");
			} else {
				System.out.println("황기태의 결과 " + result(a1, a2) + ", 이재문의 결과 " + result(b1, b2) + " 승자는  황기태");
			}

		}

	}

}
