package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		System.out.println("정수1>");
		
		Scanner scan = new Scanner(System.in);
		
		int first = scan.nextInt();
		
		System.out.println("연산을 선택하세요[+, -, *, /]");
		
		String ms = scan.next();
		
		System.out.println("정수2>");
		
		int second = scan.nextInt();
		
		switch (ms) {
		case "+":
			System.out.println("두 수의 덧셈은: " + (first + second) );
			break;
		case "-":
			System.out.println("두 수의 뺄셈은: " + (first - second) );
			break;
		case "*":
			System.out.println("두 수의 곱셈은: " + (first * second) );
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (first / second) );
			break;	
			
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.");
			System.out.println("[+, -, *, /]");
			break;
		}
		
		
	}
	
}
