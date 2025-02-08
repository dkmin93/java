package baekjoon03;

import java.util.Scanner;

public class Quiz09 { // 별찍기1
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //총 줄 수
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
