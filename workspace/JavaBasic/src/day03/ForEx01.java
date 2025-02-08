package day03;

import java.util.Scanner;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		//1~10까지의 합 for
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++ ) {
			
			sum += i;
			
			
			
		}
		
		System.out.println("1~10까지의 합 : " + sum);
		
		System.out.println("------------------------------------------------");
		
		//반대로 돌아가는 for
		
		int sum2 = 0;
		for(int i2 = 10; i2 >=1; i2--) {
			
			System.out.println(i2);
			
			sum2+=i2;
			
		}
		
		System.out.println(sum2);
		
		System.out.println("------------------------------------------------");
		
		//for문으로 입력받은 구구단을 출력.
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i3 = 1; i3<=9; i3++) {
			
			System.out.println(num + " * " + i3 + " = " + num*i3);
			
		}
		
		
	}

}
