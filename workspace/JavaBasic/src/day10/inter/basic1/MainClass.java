package day10.inter.basic1;

public class MainClass {

	public static void main(String[] args) {
		
		Basic basic = new Basic();
		basic.method01();
		basic.method02();
		
		//System.out.println(b.ABC);
		System.out.println(Basic.ABC); //이게 좀 더 올바른 표현
		
		System.out.println("====================================");
		/*
		 * 인터페이스도 하나의 데이타 타입이 될 수 있다.
		 * 이 때, 다형성으로 작동한다
		 */
		
		//오버라이딩 된 경우만 활성화됨
		Inter01 b = new Basic();
		b.method01();
		//b.method02();
		Inter02 b2 = new Basic();
		//b2.method01();
		b2.method02();
		
		System.out.println("======================================");
		
		//인터페이스에서도 클래스 캐스팅을 할 수 있다
		Basic bb = new Basic(); 
		
		
		
		
		
		
		
		
		
		
	}
	
}
