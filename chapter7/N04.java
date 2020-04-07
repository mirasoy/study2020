package chapter7;

import java.util.Scanner;
import java.util.Vector;

public class N04 {

	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Vector<Integer> rain = new Vector<>();
	
	while(true){
	System.out.print("강수량 입력 (0입력시 종료)>>");
	int input = sc.nextInt();
	if(input == 0){break;}
	rain.add(input);
	int sum = 0;
	
	for(int i : rain){
		sum += i;
		System.out.print(i+" ");
		
	}
	
	System.out.println("\n현재평균" + sum/rain.size());
	}
	
}
}
