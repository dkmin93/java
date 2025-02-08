package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch문은 selsif문과 90% 유사하다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수>");
		int point = scan.nextInt();
		
		switch ( point / 10 ) { //switch문의 소괄호에는 변수 or 연산식이 들어갈 수 있다
		case 9: //90~99
			
			if( point >=95 ) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			break;
		case 8: //80~89
			System.out.println("B학점");
			break;
		case 7: //70~79
			System.out.println("C학점");
			break;
		
		default:
			System.out.println("재수강");
			break;
		}
		
		
		
		
	}
	
}
