package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	
	public static void main(String[] args) {
		
		//StringRokenizer클래스 - 특정문자를 기준으로 잘라서 사용(split과 유사)
		
		String str1 = "오늘 날씨는 미세먼지가 많고, 매우 추워요";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		System.out.println(token1.countTokens()); //잘린 문자의 갯수
		//공백을 기준으로 잘라서 총 6덩이
		
		//반복 - 프로그램의 최초 커서는 -1에 있다가 전진한다 
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
		
		//다음이 있는지 확인하고 전진시켜야한다
		
		while(token1.hasMoreTokens()) { //다음이 있으면 true 없으면 false를 반환 반복문 돌리기 좋음
			System.out.println(token1.nextToken());
		}
		
		System.out.println("====================================================");
		
		String str2 = "2025/01/21/월요일/홍길동/서울시";
		StringTokenizer token2 = new StringTokenizer(str2, "/"); // 슬래시를 기준으로 str2를 자른다
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("====================================================");
		
		String str3 = "2025.01.21/월요일/홍길동,서울시,마포구,강남구";
		//StringTokenizer token3 = new StringTokenizer(str3, "./,"); // ""안에 있는 문자열(구분자) 하나하나 기준으로 str3를 자른다
		StringTokenizer token3 = new StringTokenizer(str3, "./,", true); // true를 넣을 경우 ""구분자 기준으로 str3를 자른다 구분자도 같이 출력
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
		
		
		
		
		
	}

}
