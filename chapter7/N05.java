package chapter7;

import java.util.ArrayList;
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

public class N05 {
	public static void main(String[] args) {
		ArrayList<Student> sArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String input = sc.nextLine();
			StringTokenizer st = new StringTokenizer(input, ", ");

			String name = (String) st.nextElement();
			String major = (String) st.nextElement();
			int number = Integer.parseInt((String) st.nextElement());
			double grade = Double.parseDouble((String) st.nextElement());
			Student e = new Student(name, major, number, grade);
			sArr.add(e);
		}
		System.out.println("----------------------");

		System.out.println(sArr);
		while(true){
			
			System.out.print("학생이름 >>");
			String name = sc.nextLine();
			for(int i = 0 ; i < sArr.size() ; i++){
				
				if(name.equals("그만")){break;}
				if(	sArr.get(i).getName().equals(name)){
					System.out.println(sArr.get(i).toString(1));
				}
				
			}
			
		}
		
	}

}
