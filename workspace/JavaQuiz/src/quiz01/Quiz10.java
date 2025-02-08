package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		//1. 1~입력받은 수 까지의 6의 배수의 합
		
		// 제어 변수 지정, 조건 지정, 제어변수 키우기
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); 
									
		int i = 1;
		int sum01 = 0;
		
		while ( i <= num ) {
			if(i % 6 == 0) {
				sum01 += i; //6의배수일때만 합계
			}
			i++;
		}
		
		System.out.println("1번 : 6의 배수의 합 " + sum01);
		
		//2. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 갯수 13개
		
		int cnt = 0; // 카운팅하는 변수
		int a = 1;
		while ( a <= 100 ) {
			if(a % 4 == 0 && a % 8 !=0) {
				cnt++;
			}
			a++;
		}
		System.out.println("2번 : 1~100까지 4의 배수이면서 8의 배수가 아닌 수의 갯수 " + cnt);
		
		
		
		//3. 50~100까지 정수들의 합
		
		int b = 50;
		int sum02 = 0;
		
		while ( b <= 100 ) {
			sum02 += b;
			b++;
		}
		System.out.println("3번 : 50부터 100까지의 정수들의 합:" + sum02);
		
		
		//4. 1000의 약수의 갯수
		
		int c = 1;
		int count = 0;
		while(c <= 1000) {
			//k가 1000의 약수인지 아닌지 확인
			if(1000 % c == 0) {
				count++;
			}
			c++;
		}
		System.out.println("1000의 약수의 갯수는 " + count);
		
		
	}

}
