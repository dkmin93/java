package quiz15;

import java.util.Scanner;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		updown게임			
		1~100사이의 정답이 주어지고, 사용자는 정답을 맞추는 게임입니다.
		정답보다, 입력값이 작다면 "더 큰 값을 입력하세요"
		정답보다, 입력값이 크다면 "더 작은 값을 입력하세요"
		를 출력합니다.
		
		정답을 맞추면, 정답횟수를 출력해주면 됩니다.
		잘못된 값을 입력한 경우에 에러처리를 하고, 시도횟수를 증가 시켜주세요.
		*/
		
		int ca = (int)(Math.random() * 100 + 1); //0이상1미만 1이상 101미만
		//System.out.println("정답:" + ca); //체크용
		int count = 0; //시도 횟수
		
		
		while(true) {
			
			try {
				System.out.println("1~100사이의 수를 하나 입력해주세요>>");
				int input = scan.nextInt();
				if(ca > input) {
					System.out.println("더 큰 값을 입력하세요");
					count++;
				} else if(ca < input) {
					System.out.println("더 작은 값을 입력하세요");
					count++;
				} else if(ca == input) {
					System.out.println("정답입니다!");
					System.out.println("시도 횟수는:" + count);
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
				scan.nextLine();
				count++;
			}
			
			
			
		}
	
		
	}

}
