package quiz01;

import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) { //baekjoon3-1 이랑 비교하기
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a = 1;
		
		while( a <= 9 ) {
			
			System.out.println(n + " * " + a + " = " + n*a);
			
			a++;
			
		}
		
	}

}
