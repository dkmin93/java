package day04;

import java.util.Arrays;

public class Arraysort02 {

	public static void main(String[] args) {

		//버블 정렬 : 쉬움 / 느림
		//큰 숫자를 뒤로 보낸다
		int[] arr = {5, 23, 1, 43, 200, 100, 40};

		// 5 1 23 43 100 40 200 1회전
		// 1 5 23 43 40 100 200 2회전
		// 1 5 23 40 43 100 200 3회전
		// 바깥반복문은 회전수
		// 안쪽반복문은 비교할 값

		//		for(int i = 0; i < arr.length - 1; i++) {
		//			
		//			for(int j = 0; j < arr.length - i - 1; j++) {
		//			
		//				if(arr[j] > arr[j+1]) {
		//					int temp = arr[j];
		//					arr[j] = arr[j+1];
		//					arr[j+1] = temp;
		//				}
		//						
		//			}
		//		}
		//		
		//		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr); // 정렬을 아주 빠르게 해준다
		System.out.println(Arrays.toString(arr));


	}

}
