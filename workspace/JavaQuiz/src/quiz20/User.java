package quiz20;

public class User implements Comparable<User> {

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

	private String name;
	private int age;

	User() {

	}

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User o) { //  ()소괄호 안이 T타입
//		
//		String name = o.getName();
//		return name.compareTo(name); //이름 기준으로 오름차순
//		return name.compareTo(this.name); //이름 기준으로 내림차순
		
		//숫자비교
		int age = o.getAge();
//		return Integer.compare(this.age, age); //오름차순 앞의 값이 크면 양수반환 작으면 음수반환 
		return Integer.compare(age, this.age); //내림차순 앞의 값이 크면 양수반환 작으면 음수반환
	
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}




}
