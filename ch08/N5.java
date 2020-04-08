package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class N5 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
System.out.println("1번파일명 입력");
		String file1 = sc.nextLine();
		System.out.println("2번파일명 입력");
		String file2 = sc.nextLine();

		FileInputStream fis = new FileInputStream("E:\\MR\\" + file1);
		FileInputStream fis2 = new FileInputStream("E:\\MR\\" + file2);

		int r1 = 0;
		int r2 = 0;

		ArrayList<Byte> ab = new ArrayList<>();
		ArrayList<Byte> ab2 = new ArrayList<>();

		while ((r1 = fis.read()) != -1) {
			ab.add((byte) r1);
		}
		while ((r2 = fis2.read()) != -1) {
			ab2.add((byte) r2);
		}

		fis.close();
		fis2.close();

		System.out.println(file1+"과 "+file2+"를 비교합니다.");
		if (ab.equals(ab2)) {
			System.out.println("동일");
		} else {
			System.out.println("다름");
		}

	}
}
