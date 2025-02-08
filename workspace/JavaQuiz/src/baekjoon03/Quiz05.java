package baekjoon03;

import java.util.Scanner;

public class Quiz05 { //빠른 A+B
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String L = "long "; 
		
		if( N % 4 == 0) {
			int num = N/4;
			for (int a = 1; a <= num; a++) {
				
				System.out.print(L);
			}
		
			System.out.print("int");
			
		}
	
		
	}

}
