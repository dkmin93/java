package day08.super_basic1;

public class Child extends Parent {
	
	//아무것도 안적어도 super는 자동으로 생략된다
//	Child() {
//		super();
//	}
	
	//부모님의 기본생성자가 없으면(부모 클래스의 매개변수가 없으면) 상속 받았을 때 강제로 생성자 연결을 해야한다
	Child() {
		super("박xx", "김xx");
	}
}
