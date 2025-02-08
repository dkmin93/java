package baekjoon01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//472
		//385
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		int s1 = second % 10;
		int s10 = (second / 10) % 10;
		int s100 = (second / 100) % 10;
		
		System.out.println( first * s1 );
		System.out.println( first * s10 );
		System.out.println( first * s100 );
		System.out.println( first * second );
		
	
		
		
		
	}

}
