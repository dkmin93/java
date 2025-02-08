package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 { //공 바꾸기

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // 바구니의 갯수
		int [] arr = new int [n]; // 바구니의 갯수와 동일한 공들 배열 생성
		int m = scan.nextInt(); // 공을 바꾼 횟수
		int temp = 0; // 임시 저장소 생성 초기값 지정

		// {1 2 3 4 5} n=5
		//  0 1 2 3 4

		for(int i = 0; i < arr.length; i++) { // 1이 최소 n이 최대인 값 배열에 저장
			arr[i] = i+1;
		}

		//m=4

		for(int i = 1; i <= m; i++) { //m회에 걸쳐서 교환할 값들을 입력받음
			int x = scan.nextInt(); //아래 temp에 저장해서 스왑할때 말고 이곳에서 변수에 -1도 가능
			int y = scan.nextInt();

			// 1 2 	첫번째와 두번째 바구니를 바꿔라

			temp = arr[x-1];
			arr[x-1] = arr[y-1];
			arr[y-1] = temp;

		}

		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + "   "); 
		}


	}

}
