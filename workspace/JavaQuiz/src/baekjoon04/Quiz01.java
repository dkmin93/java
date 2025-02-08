package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {//개수 세기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int v = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(v == arr[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
