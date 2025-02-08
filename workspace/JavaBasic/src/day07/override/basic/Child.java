package day07.override.basic;

public class Child extends Parent {

	//오버라이딩된 메서드는 무조건 먼저 실행된다
	void method02() { // 오버라이딩되었을 경우 좌측에 초록색 화살표 아이콘이 생성된다
		System.out.println("자식에서 오버라이딩 한 2번 메서드 실행");
	}
	
	// alt + shift + s, Implement Methods 오버라이드 메서드 단축키
	
	
}
