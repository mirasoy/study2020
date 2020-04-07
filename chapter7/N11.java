package chapter7;

import java.util.Scanner;
import java.util.Vector;

class Nation {

	String country;
	String capital;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Nation(String country, String capital) {
		super();
		this.country = country;
		this.capital = capital;
	}

}

public class N11 {
	public static void main(String[] args) {
		Vector<Nation> vn = new Vector<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("GAME START");
		while (true) {
			System.out.print("입력:1 퀴즈:2 종료:3 >>");

			switch (sc.nextInt()) {
			case 1:
				while (true) {
					System.out.println("현재 " + vn.size() + "개 입력완료");
					System.out.print("나라와 수도 입력" + (vn.size() + 1)+">>");

					String country = sc.next();
					
					if (country.equals("그만")) {
						break;
					}
					
					
					String capital = sc.next();
					
					
					
					
					for (int i = 0; i < vn.size(); i++) {
						if (vn.elementAt(i).getCountry().equals(country)) {
							System.out.println(country + "는 이미 있음"); break;
						} 
						

					}
					
					Nation n = new Nation(country, capital);
					vn.add(n);
					

				}

			case 2:
				while (true) {
					
					
					
				}
			
			case 3:
				System.out.println("bye");
				break;
			default:
				System.out.println("오입력");
			}

		}
	}

}
