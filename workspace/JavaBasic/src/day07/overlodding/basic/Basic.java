package day07.overlodding.basic;

public class Basic {
	
	/*
	 * 오버로딩 - 동일한 이름의 메서드, 생성자를 여러개 만드는 것
	 * 규칙
	 * 1. 이름은 같아야한다
	 * 2. 매개변수의 종류, 순서, 갯수 등을 다르게 해서 만들면 된다
	 * 
	 */

	void abc(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
	//반환 유형은 오버로딩과 상관없다
//	int abc(int a) {
//		return 0;
//	}
	
	void abc(double d) { // int속성과 다른 double속성이여도 가능
		System.out.println("실수 1개 입력받음");
	}
	
	void abc(String s, int a) { //매개 변수 갯수 자체가 달라도 가능
		System.out.println("문자열 1개, 정수 1개 입력받음");
	}
	
	void abc(int a, String s) { // 순서를 바꿔도 가능
		System.out.println("정수 1개, 문자열 1개 입력받음");
	}
	
	void abc(int a, char c, String s) {
		System.out.println("정수 1개, 문자 1개, 문자열 1개 입력받음");
	}
	
}
