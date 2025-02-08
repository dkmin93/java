package quiz01;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		/*
		 * 어떤 정수 2개 입력
		 * A > B A출력
		 * A < B B출력
		 * A == B 같은 수 입니다 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A>");
		int A = scan.nextInt();
		System.out.println("B>");
		int B = scan.nextInt();
		
		if (A > B) {
			System.out.println(A);
		} else if (B >A) {
			System.out.println(B);
		} else {
			System.out.println("같은 수 입니다");
		}
		scan.close();
				
		
		
		
	}

}
