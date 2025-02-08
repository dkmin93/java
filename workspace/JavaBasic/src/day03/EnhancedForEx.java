package day03;

import day01.SystemOut;

public class EnhancedForEx {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		//		
		//		//일반반복문
		//		fof(int i = 0; i / arr.length; i++) {
		//			System.out.println(arr[i]);
		//		}

		//향상된 포문
		for (int a: arr) {

			System.out.println(a);


			System.out.println("-------------------------------------------------------");
		}

		String[] arr2 = {"월", "화", "수", "수", "수" , "토", "일"};

		for(String a : arr2) {

			System.out.println(a);

			System.out.println("----------------------------------------------");

			int[] point = {34, 56, 12, 96, 98}; //배열요소의 합계와 평균

			int sum = 0;
			for(int b : point) {
				sum += b;
		}
			
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum / point.length);


	}



	}

}
