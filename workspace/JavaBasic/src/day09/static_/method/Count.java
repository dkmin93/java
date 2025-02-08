package day09.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반메서드에서는 일반변수 정적변수(static변수) 둘다 사용가능
	public int method01() {
		a = 10;
		return ++b;
	}
	
	//정적 메서드에서는 일반변수 접근이 안되지만 정적변수(static변수)는 접근이 된다
	public static int method02() {
		// a = 10;        //객체 자체가 만들어지지 않았으니까 불가능
		Count c = new Count();
		c.a = 1; //이렇게 객체를 만들어서 사용하는 것은 가능
		
		return ++b;       //스태틱 영역이 이미 생성 되어 있으니까 가능
	}

	
	
}
