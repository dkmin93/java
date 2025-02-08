package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("----------문제1----------");
		
		User u1 = new User("홍길동", 123123, 20); //혹은 세터로 하나하나 입력 가능 u1.set변수(정보);
		System.out.println("이름:" + u1.getName());
		System.out.println("주민등록번호:" + u1.getRrn());
		System.out.println("나이:" + u1.getAge());
		
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		
		System.out.println("----------문제2----------");
		
		User[] arr = new User[2];
		User u2 = new User("김길동", 456456, 30);
		
		arr[0] = u1;
		arr[1] = u2;
		
		//향상된 for문 for(저장할 수 있는 변수 선언 : 배열명)
		for(User u : arr) {
			System.out.println("이름:" + u.getName());
			System.out.println("주민등록번호:" + u.getRrn());
			System.out.println("나이:" + u.getAge());
		}
		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */

		System.out.println("----------문제3----------");
		
		User[] arr2 = new User[5];
		Scanner scan = new Scanner(System.in);
		int i = 0; // 제어변수 while문에서는 필수 배열이니까 0
		while(i < arr2.length) {
			String name = scan.next(); // 개인정보 입력 받기
			int rrn = scan.nextInt();
			int age = scan.nextInt();
			
			User user = new User(name, rrn, age); // 객체 생성 개인정보 저장
			
			arr2[i] = user; //배열에 입력 받은객체 저장
			
			i++; //while문 탈출조건
		}
		
		System.out.println(Arrays.toString(arr2));
		
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		
		
	}

}
