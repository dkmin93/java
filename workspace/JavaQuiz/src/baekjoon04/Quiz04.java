package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {//최댓값
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int order = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
		}
		//System.out.println(Arrays.toString(arr)); //배열 체크
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				order = i;
			}
		}
		
		System.out.println(max);
		System.out.println(order+1);
		
	}

}
