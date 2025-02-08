package baekjoon04;

import java.util.Scanner;

public class Quiz03 { //최소 최대

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //수열의 갯수 3개
		int [] arr = new int[n]; // 배열 생성


		int max = 0;
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt(); // 배열 입력 2 6 4


			if( i == 0) { // 배열 입력 후 최초 초기값 지정
				max = arr[i];
				min = arr[i];
			} 
			
			if(arr[i] > max) { //최댓값
				max = arr[i];
			}


			if(arr[i] < min) { //최솟값
				min = arr[i];
			}


		}


		System.out.println(min + " " +max);
		


		//		System.out.println(Arrays.toString(a)); //배열 확인




	}



}
