package quiz19;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다. 안녕 하세요. 오늘은
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력하고
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력해 주세요
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		StringTokenizer token = new StringTokenizer(str); //구분자가 없으면 공백 기준
		
		System.out.println("잘린 토큰의 갯수:" + token.countTokens());
		
		for(int i = 1; token.hasMoreTokens(); i++) { // for문의 가운데는 조건식, 조건식이 참이면 반복을 실행한다
			System.out.println(i + ". " +token.nextToken());
		}
		
		//안녕 하세요. 오늘은
		System.out.println("===============================================");
		
		
		
		
	}

}
