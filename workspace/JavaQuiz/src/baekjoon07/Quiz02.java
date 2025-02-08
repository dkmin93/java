package baekjoon07;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) { //Quiz23

		// 9x9의 이차원 배열 생성
		int [][] arr = new int [9][9];

		// 이차원 배열에 81개의 수를 입력받는다 반복문
		Scanner scan = new Scanner(System.in);


		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				int num = scan.nextInt();
				arr[i][j] = num;
			}
		}

	//	System.out.println("입력한 배열 확인>> " + Arrays.deepToString(arr));

		// 최댓값 변수 생성해서 반복문 통해서 크기 비교
		int max = 0;
		int x = 0; //최댓값의 행 변수
		int y = 0; //최댓값의 열 변수
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) { //(0이상이므로 등호 넣어야함)
				max = arr[i][j]; 
				if(arr[i][j] >= max) { //최댓값이 2개 이상일 경우 하나만 출력한다
					x = i+1;
					y = j+1;
				}


			}

		}
		
	
		
		System.out.println(max); //행렬의 최댓값 출력
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y); // 행렬의 최댓값의 행과 열 출력






	}

}
