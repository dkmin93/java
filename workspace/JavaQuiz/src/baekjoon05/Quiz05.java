package baekjoon05;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // 자릿수 입력받음 5 
		String b = scan.next(); // 문자 입력받음 54321
		int sum = 0; // 합계 변수
		
		
		for(int i = 0; i < a; i++) { //문자열반복
			
			// System.out.println(b.charAt(i)); // 문자 5 4 3 2 1 출력 
			
			sum += b.charAt(i) -48;
			
			
			
		}
	
		System.out.println(sum);
		
		
	}

}
