package ch6Q;

import java.util.Scanner;

public class No9 {
	public static String s(int a){
		switch(a){
		case 1 : return "����";
		case 2 : return "����";
		case 3 : return "��";
		default : return "�߸��´�!";
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("ö�� [1.���� 2.���� 3.�� 4.������]");
			int u = sc.nextInt();
			int com = (int) (Math.random() * 3) + 1;

	
			
			System.out.println("����("+s(u)+")"+": ����("+s(com)+")");

			switch (u) {
			case 1:
				if (com == 1) {
					System.out.println("����");
				}
				if (com == 2) {
					System.out.println("���Ͱ� �̰��");
				}
				if (com == 3) {
					System.out.println("�ϰ� �̰��!");
				}

				break;

			case 2:
				if (com == 2) {
					System.out.println("����");
				}
				if (com == 3) {
					System.out.println("���Ͱ� �̰��");
				}
				if (com == 1) {
					System.out.println("�ϰ� �̰��!");
				}

				break;

			case 3:
				if (com == 3) {
					System.out.println("����");
				}
				if (com == 1) {
					System.out.println("���Ͱ� �̰��");
				}
				if (com == 2) {
					System.out.println("�ϰ� �̰��!");
				}

				break;
			case 4:
				System.out.println("bye");
				System.exit(0);
			}

		}

	}
}
