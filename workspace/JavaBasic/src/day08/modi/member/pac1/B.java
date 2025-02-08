package day08.modi.member.pac1;

public class B {
	
	A a = new A(1); //public이니까 당연히 접근 가능
	A a2 = new A("홍길동"); // 같은 패키지 안이니까 접근가능
	A a3 = new A(true); 
	
	
	
	//A는 private이므로 B에서는 접근 불가능
	
	public B() {
		//여기에서 A안의 변수를 사용하고 싶다면 새로운 객체를 만들어야한다
		A a4 = new A();
		a4.a = 1; //public
		a4.b = 1; //default
		a4.c = 1; //private
		
		a4.method01();
		a4.method02();
		a4.method03(); // private 이므로 사용 불가능
	}
 	
}
