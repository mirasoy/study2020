package ch6Q;

import java.util.Random;
import java.util.Scanner;

class Person {

	public Person(String name) {
		// super();
		this.name = name;
		// this.a = a;
		// this.b = b;
		// this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	String name;
	int a;
	int b;
	int c;

}

public class N12 {
	static boolean number() {
		Random rd = new Random();
		int a = rd.nextInt(5) + 1;
		int b = rd.nextInt(5) + 1;
		int c = rd.nextInt(5) + 1;
		System.out.printf("      %d  %d  %d", a, b, c);

		if (a == b && b == c && c == a) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�׺��� ������ ���� ���� >>");
		int p = sc.nextInt();
		sc.nextLine();
		Person[] pArr = new Person[p];
		for (int i = 0; i < p; i++) {

			System.out.print((i + 1) + "��° ���� �̸� : ");

			pArr[i] = new Person(sc.nextLine());
		}

		while (true) {

			for (int i = 0; i < p; i++) {
				System.out.print(pArr[i].getName() + ": Enter!");
				sc.hasNextLine();
				
				
				
				if (number()) {
					System.out.println("  " + pArr[i].getName() + "���� �̰���ϴ�.");
					System.exit(0);
				} else {
					System.out.println(" �ƽ�����!");
				}
				sc.nextLine();

			}

		}

	}

}
