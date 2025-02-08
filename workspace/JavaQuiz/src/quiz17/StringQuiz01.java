package quiz17;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		//1.id문자열 입력 받기
		//2.아이디는 공백을 포함해서 받을 수 있다 nextLine()

		Scanner scan = new Scanner(System.in);

		String id = scan.nextLine();

		//3.공백을 제외하고 5글자 미만이면 다시 입력받기
		//4.5글자 이상이라면 "id 등록"을 출력하고 종료
		int i = 1;
		while(i < 2) {
			if(id.replace(" ", "").length() < 5) {
				System.out.println("id를 다시 입력해주세요>>");
				id = scan.nextLine();
			} else {
				System.out.println("ID 등록 완료");
				i++;
				break;
			}
		}


	}

}
