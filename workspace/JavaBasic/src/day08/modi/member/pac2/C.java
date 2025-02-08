package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

	A a = new A(1); //public이니까 당연히 접근 가능
	//	A a2 = new A("홍길동"); // C는 A와 같은 패키지가 아니므로 접근 불가능
	//	A a3 = new A(true); //A는 private이므로 당연히 B에서는 접근 불가능

	public C() {
		//여기에서 A안의 변수를 사용하고 싶다면 새로운 객체를 만들어야한다
		A a4 = new A();
		a4.a = 1; //public
		//a4.b = 1; //default
		//a4.c = 1; //private

		a4.method01();
		//a4.method02(); // default 이므로 사용 불가
		//a4.method03(); // private 이므로 사용 불가능

	}
	
}