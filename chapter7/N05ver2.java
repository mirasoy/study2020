package chapter7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {

	public Student(String name, String major, int number, double grade) {
		super();
		this.name = name;
		this.major = major;
		this.number = number;
		this.grade = grade;
	}

	String name;
	String major;
	int number;
	double grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "이름:"+name+"\n학과"+major+"\n학번"+number+"\n학점:"+grade+"\n------------------\n";
	}

	public String toString(int i) {
		return name+", "+major+", "+number+", "+grade;
	}
}

public class N05ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Student> hs = new HashMap<>();
		
		System.out.println("hs학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String input = sc.nextLine();
			StringTokenizer st = new StringTokenizer(input, ", ");

			String name = (String) st.nextElement();
			String major = (String) st.nextElement();
			int number = Integer.parseInt((String) st.nextElement());
			double grade = Double.parseDouble((String) st.nextElement());
			Student e = new Student(name, major, number, grade);
			hs.put(name, e);
		}
		System.out.println("----------------------");

		System.out.println(hs);
		while(true){
			
			System.out.print("학생이름 >>");
			String name = sc.nextLine();
				
				if(name.equals("그만")){break;}
			System.out.println(	hs.get(name).toString(1));
					
				
			
		}
		
	}

}
