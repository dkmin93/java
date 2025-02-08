package baekjoon06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 { //팰린드롬인지 확인하기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next(); // level
		String[] arr= word.split("");
		
		
		String reverse = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reverse += arr[i];
		}
		
		if(word.equals(reverse)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
		
	}

}
