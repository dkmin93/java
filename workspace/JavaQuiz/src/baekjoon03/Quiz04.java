package baekjoon03;

import java.util.Scanner;

public class Quiz04 { //영수증
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt(); //총 금액 입력
		int y = scan.nextInt(); //물건의 종류 갯수 입력
		int sum = 0; // 총 금액 합계
		   
		
		
		for(int i = 1; i <= y; i++) {
				int a = scan.nextInt(); //품목별 가격
				int b = scan.nextInt(); //품목별 갯수
				sum += (a*b);
		}
		
		if(sum == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		

	}

}
