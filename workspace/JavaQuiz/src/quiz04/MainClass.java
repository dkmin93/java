package quiz04;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		char[] arr2 = {'a', 'b', 'c'};
		String[] arr3 = {"싸이월드", "도토리", "한개만"};
		
		ToArray ta = new ToArray(); // 객체 생성
//		ta.toArray(arr1);
//		ta.toArray(arr2);
//		ta.toArray(arr3);
		
		
		ToArray.toArray(arr1);
		ToArray.toArray(arr2);
		ToArray.toArray(arr3);
		
		
		/*
		1번 과제
		Arrays.toString()와 똑같은 기능 구현하기
		1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
		2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
		2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		*/
		
	}

}
