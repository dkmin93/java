package quiz01;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
	
		/*
		 * 두 정수 A B를 한번에 입력받은 다음에 A+B의 결과를 출력하는 프로그램코드
		 * 
		 * 입력
		 * 1 2
		 * 출력
		 * 3
		 */
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A+B);
		
		scan.close();
		
		
		
	}

}
