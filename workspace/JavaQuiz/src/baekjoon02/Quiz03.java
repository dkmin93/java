package baekjoon02;

import java.util.Scanner;

public class Quiz03 { //윤년
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
