package baekjoon05;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		// T번에 걸쳐서 단어를 입력 받겠다
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); // 3회 입력 받음
		String[] arr = new String[t]; // 3크기의 배열 생성

		for(int i = 0; i < t; i++) {
			String word = scan.next();
			arr[i] = word;    


		}

		// System.out.println(Arrays.toString(arr)); // 입력받은 배열확인

		for(int i = 0; i < t; i++) {
			System.out.println(arr[i].substring(0, 1) + arr[i].substring(arr[i].length()-1));
		}



		// 단어의 첫글자와 마지막글자(길이)출력





	}

}
