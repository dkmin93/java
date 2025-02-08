package baekjoon02;

import java.util.Scanner;

public class Quiz06 { //오븐 시계

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//a는 23을 초과하면 0이 된다
		//b+c가 60을 넘어가면 a값이 증가한다
		//b+c가 60의 배수면  b는 무조건 0이다 
		//b+c가 60의 배수가 아니면
		//a는 23을 초과하지 않는 경우

		int a = scan.nextInt(); //현재 시각 입력
		int b = scan.nextInt(); //현재 분 입력
		int c = scan.nextInt(); //조리 시간 입력

		if((b + c) < 60) { // b+c가 60 미만인 경우
			b = (b + c);
		} else { // b+c가 60을 이상인 경우
			a += (b + c) / 60;
			b = (b + c) % 60;
			if(a > 23) { //a가 23을 초과하는 경우
				a -= 24; 
			}
		}




		System.out.println(a + " " + b); // 요리 완성된 시간 출력

	}

}
