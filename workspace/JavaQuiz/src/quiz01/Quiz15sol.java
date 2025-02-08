package quiz01;

import java.util.Scanner;

public class Quiz15sol {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("가로>");
		int w = scan.nextInt();
		System.out.println("세로>");
		int h = scan.nextInt();

		for(int i = 1; i <=h; i++) {

			for(int j = 1; j <= w; j++) {

				if(i == 1 || i == h) { //첫행, 마지막행
					System.out.print("*");
				} else { //첫행, 마지막행 아닐 때
					if(j == 1 || j == w) { //첫 열, 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}

		}

	}
}