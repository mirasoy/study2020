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

public class N10 {
	static boolean number() {
		Random rd = new Random();
		int a = rd.nextInt(3)+1;
		int b = rd.nextInt(3)+1;
		int c = rd.nextInt(3)+1;
		System.out.printf("      %d  %d  %d", a, b, c);

		if (a == b && b == c && c == a) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름 >>");
		Person p1 = new Person(sc.nextLine());
		System.out.print("2번째 선수 이름 >>");
		Person p2 = new Person(sc.nextLine());

		
		
		while(true){
		System.out.print("[" + p1.getName() + "] : Enter! ");
		sc.nextLine();
		if (number()) {
			System.out.println("  "+p1.getName() + "님이 이겼습니다.");
			System.exit(0);
		}else {System.out.println(" 아쉽군요!");}
		System.out.print("[" + p2.getName() + "] : Enter! ");
		sc.nextLine();
		if (number()) {
			System.out.println("  "+p2.getName() + "님이 이겼습니다.");
			System.exit(0);
		}else {System.out.println(" 아쉽군요!");}
		
		
		}
	}
}
