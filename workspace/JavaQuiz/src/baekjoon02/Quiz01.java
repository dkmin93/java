package baekjoon02;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if (A - B > 0) {
			System.out.println(">");
		} else if (A - B < 0) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
