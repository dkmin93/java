package day01;

public class IdentifierExample { // 클래스는 각각의 단어 앞글자를 대문자로

	public static void main(String[] args) {
		int age = 10;
		int Age = 20;
		
		System.out.println(age);
		System.out.println(Age); // 대소문자를 구분한다
		
		int phonenumber = 3; 
		int phoneNumber = 4; // 아래가 좀 더 바람직한 예시 (카멜 표기법, 가독성이 높아짐)
		int phone number = 5; // 공백은 사용하면 안된다. 굳이 공백을 쓰고 싶으면 _를 쓴다. 
		
		int class = 10; // class, public과 같은 키워드로는 이름을 지을 수 없음
		int public = 20;
		
	}
}
