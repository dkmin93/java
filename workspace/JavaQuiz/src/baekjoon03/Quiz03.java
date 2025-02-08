package baekjoon03;

import java.util.Scanner;

public class Quiz03 { //합
	
	public static void main(String[] args) {
		
		// n을 입력 받음. 자연수 1부터 n까지의 합
		
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		int n = scan.nextInt();
		int sum = 0;
		
		while(a <= n) {
			
			sum += a;
			
			a++;
			
			
		}
		
		System.out.println(sum);
		
	}

}
