package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 수 1개를 입력
		 * 이 숫자가 홀수, 짝수, 0, 음수인지 구분해서 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();

		if (x == 0) {
			System.out.println(0);
		} else if ( x < 0 ) {
			System.out.println("음수");
		} else if ( x % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		scan.close();
		
		
		
		
	}
	
}
