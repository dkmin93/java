package day10.inter.basic4;

public class Person implements Todo3, Todo4 { 
	//인터페이스를 상속 받을땐 이미 상속받은 인터페이스들을 받아오면 되지만
	//오버라이딩은 모든 인터페이스에게 다 해야한다.
	//인터페이스들 전부다 Person 타입이 될 수 있다.
	
	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method04() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method03() {
		// TODO Auto-generated method stub
		
	}
	
	

}
