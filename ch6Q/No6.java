package ch6Q;

import java.util.Calendar;
import java.util.Scanner;

public class No6 {

	public static int game() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Calendar cl = Calendar.getInstance();
		int i = cl.get(Calendar.SECOND);
		System.out.println("���� �� �ð�" + i);
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

		System.out.println("10�ʿ� ��������� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���½��� ����Ű����������");
		int a1 = game();
		System.out.print("10�� ���� ��  ����Ű����������");
		int a2 = game();
		System.out.print("���繮 ���� ����Ű����������");
		int b1 = game();
		System.out.print("10�� ���� ��  ����Ű����������");
		int b2 = game();

		if (Math.abs(result(a1, a2)- 10) > Math.abs(result(b1, b2)- 10)) {

			System.out.println("Ȳ������ ��� " + result(a1, a2) + ", ���繮�� ��� " + result(b1, b2) + " ���ڴ�  ���繮");
		} else {
			if ((Math.abs(result(a1, a2)- 10) == Math.abs(result(b1, b2)- 10))) {
				System.out.println("Ȳ������ ��� " + result(a1, a2) + ", ���繮�� ��� " + result(b1, b2) + " ���º�");
			} else {
				System.out.println("Ȳ������ ��� " + result(a1, a2) + ", ���繮�� ��� " + result(b1, b2) + " ���ڴ�  Ȳ����");
			}

		}

	}

}
