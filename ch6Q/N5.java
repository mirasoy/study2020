package ch6Q;

import java.util.Calendar;

public class N5 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println("���� �ð��� "+now.get(Calendar.HOUR_OF_DAY)+"�� "+now.get(Calendar.MINUTE)+"���Դϴ�.");
		if((4 <= now.get(Calendar.HOUR_OF_DAY) ) &&( now.get(Calendar.HOUR_OF_DAY) < 12)) {
			System.out.println("GOOD MONING");
		}
		if((12 <= now.get(Calendar.HOUR_OF_DAY) ) &&( now.get(Calendar.HOUR_OF_DAY) < 18)) {
			System.out.println("GOOD AFTERNOON");
		}
		if((18 <= now.get(Calendar.HOUR_OF_DAY) ) &&( now.get(Calendar.HOUR_OF_DAY) < 22)) {
			System.out.println("GOOD EVENING");
		}
		if((22 <= now.get(Calendar.HOUR_OF_DAY) ) || ( now.get(Calendar.HOUR_OF_DAY) < 4)) {
			System.out.println("GOOD NIGHT");
		}
		
	}
	
	
}
