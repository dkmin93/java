package day10.inter.basic1;

public class Basic implements Inter01, Inter02 { //인터페이스 상속을 받았는데 inter01에 추상메서드가 있으므로 상속받은 basic에서 오버라이딩 해야만한다

	//인터페이스상속(=구현)은 implements 키워드이다.
	//여러 인터페이스를 동시에 구현하는게 가능하다.

	public void method01() {
		System.out.println("오버라이딩 된 메서드 1번 실행");
	}

	public void method02() {
		System.out.println("오버라이딩 된 메서드 2번 실행");
	}

	
	


}
