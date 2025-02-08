package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz10 { //평균
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //시험 본 과목 갯수 입력받음
		double[] arr = new double[n]; // 과목별 점수들로 배열 생성
		double max = 0;
		double sum = 0; // 점수 총합계
		
		for(int i = 0; i < n; i++) { // 과목 별 점수들 입력 받음
			arr[i] = scan.nextDouble();
		}
		
		//System.out.println(Arrays.toString(arr)); // 진짜 성적 배열 체크
		
		for(int i = 0; i < n; i++) { //진짜 성적 중 최댓값 찾기
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		//System.out.println(max); // 성적 중 최댓값 출력
		
		for(int i = 0; i < n; i++) { //성적 조작 들어가기~
			arr[i] = (arr[i]/max)*100;
			sum += arr[i];
		}
		
		System.out.println(sum/n);
	}

}
