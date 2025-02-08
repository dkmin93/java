package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz07 { //과제 안 내신 분

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[30];

		for(int i = 0; i < arr.length; i++) { //출석부 생성
			arr[i] = i+1;
		}

		// System.out.println(Arrays.toString(arr)); // 출석부 체크

		int[] sub = new int[28]; // 제출한 배열 생성

		for(int i = 0; i < 28; i++) {
			sub[i] = scan.nextInt();
		}

		//System.out.println(Arrays.toString(sub)); // 제출자 체크
		Arrays.sort(sub);
		//System.out.println(Arrays.toString(sub)); // 제출자 오름차순 정렬


		//for 문으로 앞에서부터 두개씩(start,end) 비교, 뒤에서 앞에 빼서 1이 아닌경우
		//start와 end 출력
		//start와 end 사이 숫자가 미제출자

		for(int i = 0; i < sub.length-1 ; i++) {
			if(sub[i+1]-sub[i] == 2) { //차가 2
				int start = i;
				int end = i+1;
				if(sub[i] == 2) {
					System.out.println(1);
				}
				System.out.println((start) + " " + (end));
				System.out.println(sub[start]+1);
			} else if(sub[i+1]-sub[i] == 3) { //차가 1
				int start = i;
				int end = i+1;
				System.out.println(Arrays.toString(sub));
				System.out.println((start) + " " + (end));
				System.out.println(sub[start]+1);
				System.out.println(sub[start]+2);				
			}
		}


	}

}
