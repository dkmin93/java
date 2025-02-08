package quiz01;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hello", "你好", "こんにちは"};
		
		/*
		 * 랜덤한 배열의 요소를 선택하고 이 랜덤한 배열요소에 따른 국가별 언어를 출력
		 */
		
		int ran = (int)(Math.random()* arr.length); // 추후에 배열이 늘어날 경우 배열의 길이가 배열의 갯수와 같음
		
		System.out.println("선택된단어:" + arr[ran] );
		
		switch (ran) {
		case 0:
			System.out.println("한국어 입니다");
			break;
		case 1:
			System.out.println("영어 입니다");
			break;
		case 2:
			System.out.println("중국어 입니다");
			break;
		default :
			System.out.println("일본어 입니다");
			break;	

		}
		
	}
	
}
