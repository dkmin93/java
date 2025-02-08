package day09.poly.basic;

public class Child extends Parent {

	//1번 메서드는 상속받은 상태
	
	//오버라이드
	public void method02() {
		System.out.println("자식에 오버라이드(재정의) 된 2번 메서드 실행"); //Parent의 2번 메서드를 오버라이딩
	}
	
	public void method03() {
		System.out.println("자식의 3번 메서드 실행"); //자식만의 기능
	}
	
}
