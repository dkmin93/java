package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		//숙제
		/*
		 * 
		 * 어떤 수를 입력 받아서, 입력받은 수까지의 모든 소수들의 합계를 구하라
		 * 
		 * 10은 2 3 5 7 = 17
		 * 13은 2 3 5 7 11 13 = 41 
		 *
		 */


		// 		//약수의 개수
		// 		int count = 0;
		// 		for(int i = 1; i <= 5; i++) {
		// 			
		// 			if(5 % i == 0) {
		// 				count++;
		// 			}
		// 			
		// 		}
		// 		
		// 		if(count == 2) {
		// 			//5는 소수
		// 		}

		Scanner scan = new Scanner(System.in);
		System.out.println("정수>>");
		int num = scan.nextInt();

		int sum = 0;
		int count = 0;

		for(int i = 1; i <= num; i++) {

			//1의 약수 갯수, 2의 약수 갯수, num까지의 약수의 갯수
			for(int j = 1; j <= i; j++) {

				//여기서 약수 개수를 구해보면			}
				if(i % j ==0) {
					count++;
				}
			}

			if(count == 2) {
				//i는 소수라고 할 수 있다.
				sum += i;
			}
			
			count = 0;
		}

		System.out.println(num + "까지의 소수의 합:" + sum);

	}
}
