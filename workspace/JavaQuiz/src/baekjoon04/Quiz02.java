package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 { //quiz19 x보다 작은수
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //  수열의 갯수 길이 입력 받음
		int x = scan.nextInt(); // 수열의 값이 x보다 작으면 출력
		int[] arr = new int[n]; // 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();			
		}
		
		// System.out.println(Arrays.toString(arr)); // 배열생성 체크
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
	}

}
