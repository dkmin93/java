package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 { //공넣기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 바구니의 갯수 입력받음, 바구니의 
		int m = scan.nextInt(); // m번에 걸쳐 공을 넣는 횟수 입력받음
		int [] arr = new int[n]; // 바구니 배열 생성
		
		//System.out.println(Arrays.toString(arr)); //바구니 배열체크
		
		//					4줄
		for(int a = 1; a <= m; a++) { //범위와 공번호 값 입력 받음
			int i =scan.nextInt(); // 범위의 시작 i번 이상부터
			int j =scan.nextInt(); // 범위의 끝  j번 이하까지
			int k =scan.nextInt(); // k번 공을 1개씩 넣는다
			
			for(int b = i; b <= j; b++) {
				arr[b-1] = k;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		/*			바구니에 공은 1개만 넣을 수 있다
		 * 
		 * 	1 2 3		1~2번 바구니에 0~1번 인덱스에 3번공을 넣는다
			3 4 4		3~4번 바구니에 2~3번 인덱스에 4번공을 넣는다
			1 4 1		1~4번 바구니에 0~3번 인덱스에 1번공을 넣는다
			2 2 2		2~2번 바구니에 1~1번 인덱스에 2번공을 넣는다
						i~j			            변수k
		 */
		
		

		
	}

}
