package ch08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Open {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileReader fin = new FileReader("E:\\MR\\words.txt");
		BufferedReader br = new BufferedReader(fin);
		ArrayList<String> wd = new ArrayList<>();

		Random rd = new Random();
		String line = null;
		while ((line = br.readLine()) != null) {
			wd.add(line);
		}

		System.out.println("GAME START");
		while (true) {

			int idx = rd.nextInt(wd.size());
			String str = wd.get(idx);
			// 단어받기

			Set<Integer> rdi = new HashSet<>(2);

			for (int i = 0; rdi.size() < 2; i++) {
				rdi.add(rd.nextInt(str.length()));

			} // 가릴숫자만들기
			ArrayList<Integer> rdnum = new ArrayList<>();
			rdnum.addAll(rdi);

			StringBuffer sb = new StringBuffer(str);

			sb.replace(rdnum.get(0), rdnum.get(0) + 1, "_");
			sb.replace(rdnum.get(1), rdnum.get(1) + 1, "_");
			System.out.println(sb);

			String ans1 = Character.toString(str.charAt(rdnum.get(0)));
			String ans2 = Character.toString(str.charAt(rdnum.get(1)));
			int cnt = 0;
			int heart = 5;
			boolean q1 = false;
			boolean q2 = false;
			while (!(q1&&q2)) {
				System.out.print(">>");
				String input = sc.nextLine();
				if (input.equals(ans1)) {

					sb.replace(rdnum.get(0), rdnum.get(0) + 1, ans1);
					
					q1 = true;

				}
				if (input.equals(ans2)) {

					sb.replace(rdnum.get(1), rdnum.get(1) + 1, ans2);
//					System.out.println(sb);
					q2 = true;
				}
				heart--;
				if (heart == 0) {
					System.out.println("5번 실패하였습니다.");
					System.out.println(str);
					break;
				}
				System.out.println(sb);
			}

			System.out.println("Next(y/n)");
			switch (sc.next()) {
			case "y":
			case "Y":
				sc.nextLine();
				break;
			case "n":
			case "N":
				System.out.println(" bye bye");
				System.exit(0);

			}

		}

	}
}
