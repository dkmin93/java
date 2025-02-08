package day06;

public class Variable {
	
	//멤버 변수(=전역 변수) : 초기화 하지 않으면 0, 0.0, null로 자동 초기화
	int a;

	void printNum(int c) { //매개변수도 지역변수에 속한다
		int b = 1; // 지역변수. 초기화를 해야만 사용 가능하다
		System.out.println("멤버변수:" + a);
		System.out.println("지역변수:" + b);
		System.out.println("매개변수:" + c);
		
	}
	
}
