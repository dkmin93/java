package day09.static_.method;

public class MainClass {
	
	public static void main(String[] args) {
		
		//메인 함수는 static이므로 항상 객체를 생성해서 접급했다
		Count c = new Count();
		c.a = 1;
		
		//static 멤버는 객체 생성 없이 접근이 된다.
		Count.b = 1;
		Count.method02();
		
		MainClass m = new MainClass();
		m.example();
	}

	public static void example() {
		System.out.println("hello world");
	}
	
}
