package day08.modi.member.pac1;

public class A {
	
	public A(int i) {}
	A(String s) {}
	private A(boolean b) {} // 밖에서 객체생성을 못하게 할때 생성자에 private를 붙인다
	
	///////////////////////////////////////
	
	public int a;
	int b;
	private int c;
	
	public A() { //접근제한자가 무엇이든 간에 자신의 클래스 내부에서는 전부 다 사용가능
		a = 1;
		b = 1;
		c = 1;
		method01();
		method02();
		method03();
	} //생성자
	
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	
}
