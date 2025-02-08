package quiz16;

import java.util.Scanner;

public class Caculator {

	public static int input() throws Exception {

		//1. 정수 2개를 입력 받는다
		//2. 두 값이 정수라면 단순히 합계를 반환
		//3. 예외발생 시 catch안에서 예외를 다시 생성하고 Throws처리
		//4. scan.cldse 는 finally 구문에서 처리

		Scanner scan = new Scanner(System.in);

		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = 0;
			sum = a+b;
			return sum;
			
		} catch (Exception e) {
			throw new Exception("정수만 입력해주세요");
		} finally {
			scan.close();
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		
		
		System.out.println(input());
	}
}
