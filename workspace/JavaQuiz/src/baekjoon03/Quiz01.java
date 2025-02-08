package baekjoon03;

import java.util.Scanner;

public class Quiz01 { //구구단

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = 1;
		int multi = scan.nextInt(); 
		
		while( n < 10 ) {
			
			
			System.out.print(multi);
			System.out.print(" * ");
			System.out.print(n);
			System.out.print(" = ");
			System.out.println(n * multi);
			
			n++;
		}
		
	}
	
}
