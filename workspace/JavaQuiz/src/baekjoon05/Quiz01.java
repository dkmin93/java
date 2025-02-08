package baekjoon05;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next(); // 영어단어 입력 받음 Sprout
		int i = scan.nextInt(); // 정수 입력받음 3 r 출력 되야함
		 
		System.out.println(s.substring(i-1, i));
		
		
	}

}
