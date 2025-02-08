package day03;

import java.util.Scanner;

public class WhileEx03 { // 백준 9-5
	
	public static void main(String[] args) {
		
		// while조건은 다양한 형식으로 만들어 질 수 있다
		// 어떤 수를 입력 받아서 이 수가 소수인지 확인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력>");
		
		int num = scan.nextInt();
		
		int i = 2; // 어차피 모든 수는 1로 나누면 나머지가 0이 나오기에 2부터 시작한다
		
		while(num % i !=0) { // 소수를 구하는 과정에서 결국엔 어떤 수를 자기 자신으로 나누면 0이 나오는 과정이 마지막이므로 나온다 
			
			i++;
		}
		
		if(i == num) { // 결국엔 1을 제외한 자기자신으로 나눠서 0이나오는 과정이 바로 나오면 소수
			System.out.println(num + "는 소수입니다");
		} else {
			System.out.println(num + "는 소수가 아닙니다");
		} 
		
		scan.close();
	}

}
