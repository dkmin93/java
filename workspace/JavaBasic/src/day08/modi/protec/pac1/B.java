package day08.modi.protec.pac1;

public class B {
	
	public B() { //기본 생성자 빨리 만들기는 ctrl + space + enter
		
		A a = new A();
		a.bool = true; //같은 패키지 접근 가능
		a.method();
		
	}

}
