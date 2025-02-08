package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz01 {
	
	public static void main(String[] args) {
		

		Map<String, String> map = new HashMap<>();

		map.put("kim1234", "1234");
		map.put("lee5678", "5678");
		map.put("park4321", "1111");

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력해주세요>");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요>");
			String pw = scan.next();
			
			if(map.containsKey(id)) { //아이디 체크 아이디 존재하는 경우
				if(map.containsKey(id)) {//비밀번호 체크 일치하는 경우
					System.out.println("로그인 성공");
					break;
				} else { //비밀번호 틀린경우
					System.out.println("비밀번호가 틀렸습니다");
				}
			} else { //아이디 마저 틀린 경우
				System.out.println("아이디가 존재하지 않습니다");
				break;
			}
		}
		/*
		 * <로그인 입력값 검증>

		 * 1. 입력받은 아이디가 맵에 입력된 키값에 
		 *    해당하는지의 여부를 검사하여(containsKey 메서드 활용)
		 * 2. 맞다면 다시한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 *    "로그인 성공"을 콘솔에 출력하고 반복문을 탈출하세요.
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요.
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면 
		 *    "아이디가 존재하지 않습니다"를 출력하세요.
		 */
		
	}

}
