package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.첫째줄에 N 정수가 주어진다
		 * 2.이후부터는 N줄에 걸쳐서 정수를 입력받는다
		 * 3.이 입력 받은 값을 배열에 순서대로 저장
		 * 
		 * 배열의 크기지정
		 * int[] arr = new int[크기]
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0; //배열이기 때문에 0부터 시작가능
		
		int[] arr = new int [n]; //입력받은 값만한 배열을 생성
		
		while ( a < n) { // 배열이기때문에 등호를 뺀다
	
			//입력받은 값을 배열에 넣는다.
			arr[a] = scan.nextInt();
			
			a++;
			
		}
		
		System.out.println(Arrays.toString(arr));

		
		
		
	}

}
