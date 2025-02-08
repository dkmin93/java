package baekjoon03;

import java.util.Scanner;

public class Quiz11 { // A+B -5
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			
			int a = scan.nextInt();		
			int b = scan.nextInt();	
			
			
			
			if(a != 0 && b != 0) {
				System.out.println(a+b);
			} else { 
				break;
			}
				
		 
		}
	}

}
