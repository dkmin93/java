package quiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {

		/*
		 * 랜덤한 1~100까지의 두 수의 덧셈 문제 생성, 정답맞추기 프로그램
		 * 
		 * 1. 0을 입력하면 종료
		 * 2. 종료시 정답 오답 갯수를 출력
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int okCount = 0; // 정답인 갯수 
		int noCount = 0; // 오답인 갯수

		while(true) {

			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			System.out.println("---------------------");
			System.out.println(a + " + " + b + " = " + " ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.println("> ");
			int answer = scan.nextInt();

			if(answer == 0) {
				System.out.println("프로그램 정상 종료!");
				break;
			}
			
			if(a + b == answer) { //정답인경우
				System.out.println("정답입니다");
				okCount++;
			} else { //틀린경우
				System.out.println("오답입니다");
				noCount++;
			}


		}

		System.out.println("정답갯수:" + okCount);
		System.out.println("오답갯수:" + noCount);
		

	}

}
