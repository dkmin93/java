package baekjoon03;

import java.util.Scanner;

public class Quiz10 { //별찍기 2
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int star = scan.nextInt();
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) { //공백 출력
				System.out.print(" ");	
			}
			for(int j = 1; j <= i; j++) { // 별 출력
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
