package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean running = true;
		Map<String, String> menu = new HashMap<>();
		Set<String> keySet = menu.keySet();

		try {
			while(running) {
				System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
				System.out.println("메뉴 번호를 입력해 주세요>>");
				int num = scan.nextInt();
				

				//* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
			
				switch (num) { //김밥 1000원 순대 2000원 떡볶이 3000원 튀김 4000원
				//1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
				case 1: // if문 확인 메뉴 맵으로 등록
					System.out.println("메뉴를 등록합니다.");
					System.out.println("등록할 메뉴를 가격과 함께 입력해주세요>>");
					String inputMenu = scan.next();
					String menuPrice = scan.next();
					if(menu.containsKey(inputMenu)) { //이미 존재하는 경우
						System.out.println("이미 존재하는 메뉴입니다.");
					} else { //메뉴 등록
						menu.put(inputMenu,menuPrice);
						System.out.println("메뉴 등록 완료!");
					}
					break;
				//2. 메뉴와 가격을 전부 출력
				case 2:
					System.out.println("전체 메뉴를 조회합니다.");
					for(String key : keySet) {
						System.out.println("메뉴:" + key + ", 가격:" + menu.get(key));
					}
					break;
				//3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
				case 3:
					System.out.println("메뉴 가격을 수정합니다.");
					System.out.println("수정할 메뉴와 가격을 함께 입력해주세요>>");
					String changeMenu = scan.next();
					String changePrice = scan.next();
					if(menu.containsKey(changeMenu)) { //메뉴 수정하는 경우
						menu.put(changeMenu, changePrice);
						System.out.println(changeMenu + "의 가격을 " + changePrice + "으로 수정합니다.");
					} else { // 제대로 입력이 안된 경우
						System.out.println("메뉴명과 가겨을 정확히 입력해주세요.");
					}
					break;
				//4. 삭제할 메뉴를 받아서 메뉴가 있다면 삭제
				case 4:
					System.out.println("메뉴를 삭제합니다.");
					System.out.println("삭제할 메뉴명을 입력해주세요>>");
					String deleteMenu = scan.next();
					if(menu.containsKey(deleteMenu)) { //메뉴 삭제
						menu.remove(deleteMenu);
						System.out.println(deleteMenu + "을(를) 메뉴에서 삭제합니다.");
					} else { // 제대로 입력이 안된 경우
						System.out.println("삭제할 메뉴를 정확히 입력해주세요.");
					}
					break;
				//5. 프로그램 종료
				case 5:
					System.out.println("프로그램을 종료합니다.");
					running = false;
					break;

				default:
					System.out.println("유효하지 않은 메뉴 번호 입니다.");
				}




			}
		} catch (Exception e) {
			System.out.println("메뉴 번호만을 정확히 입력해 주세요.");
		}
		
		
		











	}

}
