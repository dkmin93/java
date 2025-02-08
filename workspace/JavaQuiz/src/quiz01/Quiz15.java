package quiz01;

import java.util.Scanner;

public class Quiz15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로>");
		int x = scan.nextInt();
		System.out.println("세로>");
		int y = scan.nextInt();
		
	for (int i = 1; i <= x; i++) { //첫번째줄
		System.out.print("*");
	}
	
	System.out.println();
	
	for (int i = 1; i <= y-2; i++) { //사이 라인
		System.out.print("*");
		
		for(int j = 1; j <= x-2; j++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
	}
	
	for (int i = 1; i <= x; i++) { //마지막줄
		System.out.print("*");
	}
		
		
	}

}
