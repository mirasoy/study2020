import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class N14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일탐색기입니다--------------");
		ArrayList<String> fArr = new ArrayList<String>();

		while (true) {
			try {
				String location = "c:\\";
				System.out.print(">>");
				String file = sc.nextLine();
				StringTokenizer st = new StringTokenizer(file, " ");
				ArrayList<String> token = new ArrayList<String>();
				for (String s : fArr) {
					location += s + "\\";
				}
				while (st.hasMoreElements()) {
					token.add(st.nextToken());
				}

				// 입력어분리

				if (token.get(0).equals("..")) {
					fArr.remove(fArr.size() - 1);
				} else if (token.get(0).equals("rename")) {
					File folder = new File(location + token.get(1));
					File folder2 = new File(location + token.get(2));

					folder.renameTo(folder2);

				} else if (token.get(0).equals("mkdir")) {
					File folder = new File(location + token.get(1));
					folder.mkdir();
				} else {
					fArr.add(token.get(0));
					location += token.get(0) + "\\";
				}

				// 입력어에 따른 명령실행

				System.out.println(location);
				File folder = new File(location);
				File[] fv = folder.listFiles();
				// 파일리스트생성

				ArrayList<String> dir = new ArrayList<String>();
				for (File f : fv) {
					if (f.isDirectory()) {
						dir.add("dir");
					} else {
						dir.add("file");
					}
				}

				ArrayList<Long> size = new ArrayList<Long>();
				for (File f : fv) {
					size.add(f.length());
				}

				ArrayList<String> name = new ArrayList<String>();
				for (File f : fv) {
					name.add(f.getName());
				}

				// 파일 요소 받아오기

				for (int i = 0; i < fv.length; i++) {
					System.out.println(dir.get(i) + "\t" + size.get(i) + "\t\t" + name.get(i));
				}
			} catch (NullPointerException e) {
				fArr.remove(fArr.size() - 1);
				System.out.println("잘못된입력입니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못된입력입니다.");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("입력갯수가 부족합니다.");
			}

			System.out.println("---------------------------------");

			// 출력
		}
//		

	}
}
