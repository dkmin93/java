package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz08 { //나머지

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10]; // 10칸짜리 배열 생성
		int repeat = 0; // 중복된 수

		for(int i = 0; i<10; i++) { //배열 입력 받기
			arr[i] = scan.nextInt();
			arr[i] = arr[i] % 42;

			//System.out.println(Arrays.toString(arr)); // 42로 나눈 나머지 체크


		}

		//int initial = arr[i];
		//if(initial != arr[i]) {
		//	count++;
		//}

		//System.out.println(Arrays.toString(arr)); // 42로 나눈 나머지 체크
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));


		for(int i = 0; i < 9; i++) { //앞에서부터 2개씩 비교 같은 경우에 반복 1씩 올림
			if(arr[i]==arr[i+1]) {
				repeat++;
			}
		}
		
		System.out.println(10-repeat);
		
		//답은 6

	}

}
