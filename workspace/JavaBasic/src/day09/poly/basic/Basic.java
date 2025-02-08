package day09.poly.basic;

/*
 * 하나의 파일에 여러 클래스를 선언 할 수도 있다.
 * 대신 파일명과 동일한 클래스는 반드시 존재해야 하며 해당 클래스만 public이면 된다.
 * 자주 사용되는 기능은 아니다
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int i = 1;
	double j = i; // int타입이 double타입으로 자동형변환이 된 것이다
	
	A a2 = b; //부모타입 A에 자식 B를 저장할 수 있다.
	//B클래스가 A클래스로 자동형변환이 된 것. 클래스도 타입이니 부모 자식 클래스간 형변환이 가능
	A a3 = new B();
	A a4 = new C();
	A a5 = new D();
	A a6 = new E();
	
	//C cc = new D(); //상속관계가 아니면 다형성 적용이 되지않는다.
	//Object는 최고 부모 클래스인데 뭐든 다 담을 수 있을까? 물론
	
	Object o1  = new A();
	Object o2 = 1;
	Object o3 = "홍길동";

}
