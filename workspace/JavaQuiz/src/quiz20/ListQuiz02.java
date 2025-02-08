package quiz20;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
		 */

		List<User> list = new ArrayList<>();

		//
		
		User user01 = new User();
		User user02 = new User();

		user01.setAge(20);
		user02.setAge(30);

		user01.setName("홍길동");
		user02.setName("홍길자");

		list.add(user01);
		list.add(user02);
		
		// list.add(new User("홍길동", 20)); 이렇게 축약할 수 있다
		// list.add(new User("홍길자", 30));

		System.out.println(list.toString());
		
		System.out.println("=================================================");
		
		for(int i = 0; i < list.size(); i++) {
		User u = list.get(i);
		
		System.out.println(u.getName());
		System.out.println(u.getAge());
		}
		
		System.out.println("=================================================");
		
		for(User user : list) {
			System.out.println(user.getName());
			System.out.println(user.getAge());
		}

		System.out.println("=================================================");
		
		for(User user : list) {
			if("홍길자".equals(user.getName())) {
				System.out.println(user.getName());
				System.out.println(user.getAge());
			}
		}

		System.out.println("=================================================");
		
		for(User user : list) {
			if("홍길동".equals(user.getName())) {
				list.remove(user);
			}
		}

		System.out.println(list.toString());
		




	}

}
