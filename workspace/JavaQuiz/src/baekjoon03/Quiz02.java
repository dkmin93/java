package baekjoon03;

import java.util.Scanner;

public class Quiz02 { //A + B - 3
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt(); // 테스트 케이트 횟수 입력
		int sum = 0;
		
		
		for(int i = 1; i <= t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum = a + b;
			System.out.println(sum);
		}
		
		
		
	}

}
