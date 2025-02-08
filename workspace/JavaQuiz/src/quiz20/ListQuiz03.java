package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {//회원정보 프로그램 시뮬레이터

	public static void main(String[] args) {

		//무한 반복문 안에서 메뉴를 입력 받고 해당메뉴에 알맞은 내용 채워 넣기

		//메뉴 1.유저등록 2.전체회원정보출력 3.회원정보검색 4.회원정보삭제 5.프로그램종료

		//1.스캐너로 name, age 입력 받아서 User 객체를 리스트에 추가

		//2.모든 회원 정보를 출력

		//3. 찾을 이름을 입력받아서 이름이 있으면 이름과 나이 출력
		//없을 경우 "입력받은이름"님은 목록에 없습니다 멘트 출력

		//4. 삭제할 이름을 입력받고 동일한 이름을 가진 회원이 있으면 삭제

		//5. 종료  

		Scanner scan =  new Scanner(System.in);
		List<User> list = new ArrayList<>();
		boolean running = true;

		while(running) {
			//1.회원 정보 등록 2.전체 회원 정보 조회 3.회원 정보 검색 4.회원 정보 삭제 5.프로그램 종료
			String menu = scan.nextLine();
			System.out.println(menu);
			System.out.println("메뉴 번호를 입력해 주세요>>");
			int number = scan.nextInt();
			
			switch (number) {
			case 1: //홍길동 20 홍길자 30 박인욱 40
				System.out.println("회원정보를 등록합니다.");
				System.out.println("회원님의 이름과 나이를 순서대로 입력해주세요>>");
				list.add(new User(scan.next(), scan.nextInt()));
				System.out.println("등록 완료");
				break;
			case 2:
				System.out.println("전체 회원 정보를 조회합니다.");
				for(int i = 0; i < list.size(); i++) {
					User user = list.get(i);
					System.out.println("====================");
					System.out.println(user.getName());
					System.out.println(user.getAge());
					}

				break;
			case 3: 
				System.out.println("회원정보를 검색합니다.");
				System.out.println("검색할 회원님의 이름을 입력해주세요>>");
				String searchname = scan.next();  
				for(User user : list) {
					if(searchname.equals(user.getName())) {
						System.out.println("====================");
						System.out.println(user.getName());
						System.out.println(user.getAge());
						
					} else if(!searchname.equals(user.getName())) {
						System.out.println(searchname + "님의 회원 정보가 존재하지 않습니다.");
						
					}
				}
				break;
			case 4:
				System.out.println("회원정보를 삭제합니다.");
				System.out.println("삭제할 회원님의 이름을 입력해주세요>>");
				String deletename = scan.next();
				for(User user : list) {
					if(deletename.equals(user.getName())) {
						list.remove(user);
						
					} else {
						System.out.println(deletename + "님의 회원 정보가 존재하지 않습니다.");
						
					}
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				running = false;
				break;
			default:
				System.out.println("유효하지 않은 번호 입력입니다");
				break;
			}
		
		}


	}

}
