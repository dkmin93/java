package day05;

import java.util.Scanner;

public class StudentManager {

	static Scanner scan = new Scanner(System.in);

	static String[] nameList = new String[100]; //배열을 늘리거나 줄이거나x
	static int[] ageList = new int[100];
	static int count = 0; // 사람 수
	static int index = -1; //위에 있는 배열을 조회하는 위치(포인터)

	//가령 index = 0이면 배열의 0번째 위치를 조회하고 있다

	public static void main(String[] args) { // 메인함수 시작

		x:while(true) {
			System.out.println("[현재고객수]:" + count + "\n[조회위치]" + index);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.프로그램종료");
			System.out.print("메뉴입력>");
			String menu = scan.next();

			switch (menu) {
			case "1": 
				System.out.println("======회원 정보를 입력합니다======");
				add();
				System.out.println("<회원정보 입력 성공>");
				System.out.println("====================================");
				break;

			case "2":
				/*
				 * index 위치를 -1 시키고 해당 위치정보 출력
				 * 이전 정보가 존재하지 않는 조건
				 * index <= 0
				 */
				System.out.println("======이전 회원 정보를 조회합니다======");
				if(index <= 0) { //이전 정보가 없는 경우 = 회원이 1명인 경우 범위 생각해보기!!!
					System.out.println("<이전 회원 정보는 없습니다>");
					System.out.println("====================================");
				} else {
					index--;
					printInfo();
					System.out.println("====================================");
				}
				break;

			case "3": // 재확인
				System.out.println("======다음 회원 정보를 조회합니다======");
				if(count >= 1 && index >= -1) { //최소 1명이 있어야함 카운트는 1이상
					++index;
					printInfo();
					System.out.println("====================================");
				} else {
					System.out.println("<다음 회원 정보는 없습니다>");
					System.out.println("====================================");
				}
				break;

			case "4": //사람수가 3명이라면 인덱스는 012존재 인덱스는 항상 카운터-1 이하여야한다
				System.out.println("======현재 회원 정보를 조회합니다======");
				if(index >=0 && index <= count-1) { 
					printInfo();
					System.out.println("====================================");
					
				} else {
					System.out.println("<현재 회원 정보는 없습니다>");
					System.out.println("====================================");
				}
				break;

			case "5":
				/*
				 * 정보수정
				 * 새로운 이름 나이를 입력받아서
				 * 현재 위치를 수정
				 * 현재 위치가 수정가능한 조건
				 * 생각해보기
				 */
				System.out.println("======현재 회원 정보를 수정합니다======");
				if(index >= 0 && index <= count - 1) {
					System.out.println("수정할 정보를 새로 입력해주세요");
					edit();
					System.out.println("<회원정보 수정이 완료되었습니다>");
					System.out.println("====================================");
				} else {
					System.out.println("<현재 회원 정보는 없습니다>");
					System.out.println("====================================");
				}
				break;

			case "6":
				/*
				 * 정보삭제
				 * 현재삭제하려는 index위치부터 ~뒤에 있는 배열 요소를 당겨와서 덮어 씌우기
				 * count를 감소
				 * 삭제가 가능한 조건은 위와 동일
				 */
				System.out.println("======회원 정보를 삭제합니다======");
				if(index >= 0 && index <= count-1) {
					delete();
					count--;
					System.out.println("<회원정보 삭제가 완료되었습니다>");
					System.out.println("====================================");
				} else {
					System.out.println("<현재 삭제할 회원 정보는 없습니다>");
					System.out.println("====================================");
				}
				break;

			case "7":
				/*
				 * 반복문을 탈출하고 프로그램 종료
				 */
				System.out.println("프로그램 종료");
				break x; //while문 맨 앞에다 x라고 이름을 붙여서 탈출
				// System.exit(0); //윗줄의 브레이크 대신 사용 가능
				
			default:
				System.out.println("<메뉴를 다시 입력해주세요>");
				break;
			}
		}

	} //메인함수 끝


	//아래에서부터 메뉴 함수들 생성


	static void add() { // 회원정보 추가
		//입력을 받음. 배열에 추가
		System.out.print("이름>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();

		nameList[count] = name;
		ageList[count] = age;
		count++; // 고객수 증가
	}


	static void printInfo() {
		System.out.println("이름:" +nameList[index]);
		System.out.println("나이:" +ageList[index]);
	}

	static void edit() { //회원정보 수정
		System.out.print("수정할 이름>");
		String name = scan.next();
		System.out.println("수정할 나이>");
		int age = scan.nextInt();
		
		nameList[index] = name;
		ageList[index] = age;
	}
	
	static void delete() { //회원정보 삭제
		for(int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i+1];
			ageList[i] = ageList[i+1];
		}
			
	}
	
} //전체함수 끝
