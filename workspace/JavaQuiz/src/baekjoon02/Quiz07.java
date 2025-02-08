package baekjoon02;

import java.util.Scanner;

public class Quiz07 { //주사위 세계

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int prize = 0;

		// 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		// 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		// 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

		if(a == b && a == c) { // 1번
			prize = 10000 + (a * 1000);
		} else if(a == b || b == c || c == a ) { //2번
			int same = 0;
			if(a == b) {
				same = a;
			} else if (b == c) {
				same = b;
			} else if (c == a) {
				same = c;
			}
			prize = 1000 + (same * 100);
		} else if(a != b && b != c && c != a) { // 3번
			int high = 0;
			if(a > b) {
				if(a > c) {
					high = a;
				} else {
					high = c;
				}
			} else { // a < b 인 경우
				if(b > c) {
					high = b;
				} else {
					high = c;
				}
			} prize = high * 100;
		}
		
		System.out.println(prize);
	}
}
