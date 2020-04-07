package chapter7;

import java.util.Scanner;
import java.util.Vector;

 abstract class Shapeone {

	private Shapeone next;

	public Shapeone() {
		next = null;
	}

	public void setNext(Shapeone obj) {
		next = obj;
	}

	public Shapeone getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shapeone {

	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shapeone {

	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shapeone {

	public void draw() {
		System.out.println("Circle");
	}
}

public class N10 {

	public static void main(String[] args) {

		Vector<Shapeone> vs = new Vector<>();
		// vs.add(new Line());
		// vs.add(new Rect());
		// vs.add(new Circle());
		Scanner sc = new Scanner(System.in);
		System.out.println("실행");
		while (true) {

			while (true) {
				System.out.println("1.삽입 2.삭제 3.모두보기 4.종료");

				switch (sc.nextInt()) {

				case 1:
					System.out.println("1.line 2.rect 3.circle");
					switch (sc.nextInt()) {
					case 1:
						vs.add(new Line());
						break;
					case 2:
						vs.add(new Rect());
						break;
					case 3:
						vs.add(new Circle());
						break;
					default:
						System.out.println("입력오류");
					}

					break;
				case 2:
					System.out.println("삭제할도형위치");
					int jj = sc.nextInt();
					if (jj > vs.size()) {
						System.out.println("삭제할수없습니다.");
					} else {
						vs.remove(jj - 1);
					}

					break;
				case 3:
					
					for(int i = 0 ; i < vs.size() ; i++){
						vs.elementAt(i).draw();
					}
					
					break;
				case 4:
					System.out.println("그래픽 에디터 종료.");
					System.exit(0);
				default:
					System.out.println("입력오류");
				}
			}

		}

	}

}
