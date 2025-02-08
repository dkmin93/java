package baekjoon03;

import java.util.Scanner;

public class Quiz12 { //A+B-4 EOF를 알아야 풀 수 있다.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		String line;
		while ((line = br.readLine()) != null) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
	}

}


