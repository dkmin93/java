package baekjoon02;

import java.util.Scanner;

public class Quiz05 { //알람 시계

	public static void main(String[] args) { //입력한 시간보다 45전 시간 출력하기

		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();

		if(h == 0) { // 0시인 경우
			if( m >= 45) {// 분이 45분 이상일경우
				m -= 45;
			} else {// 분이 45분 미만일 경우
				h = 23;
				m += 15;
			}
		} else { // 0시가 아닌경우
			if( m >= 45) {// 분이 45분 이상일경우
				m -= 45;
			} else {// 분이 45분 미만일 경우 10시 10분
				h -= 1;
				m += 15;
			}
		}
	
		System.out.println(h + " " + m); // 9시 25분 출력


	}

}
