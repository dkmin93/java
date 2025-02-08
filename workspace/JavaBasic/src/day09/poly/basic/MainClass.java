package day09.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //Parent에서 상속받은 1번 메서드
		c.method02(); //Child에서 오버라이딩한 2번 메서드
		c.method03(); //Child만의 3번 메서드
		
		System.out.println("================다형성 적용===================");
		
		Parent p = c; // c의 타입이 일시적으로 Child에서 Parent로 형변환 된 것
		System.out.println("주소값:" + c);
		System.out.println("주소값:" + p); //주소값은 같다
		
		p.method01();
		p.method02(); // 다형성이 적용되었지만 자식에서 오버라이드 했기 때문에 먼저 출력된다
		//p.method03(); 애초에 나올 수가 없다. 다형성이 적용되어서 Parent의 기능만 쓸 수 있기 때문
	
		System.out.println("================클래스 캐스팅===================");
		
		Parent pp = new Child(); //Child로 만들어서 pp에 저장한다는 의미
		
		Child cc = (Child)pp; // 이미 Parent로 승격된 pp를 다시 Child형으로 강제 형변환
		
		cc.method01();
		cc.method02(); //다시 Child 타입으로 형변환 되었기에 기존 Child형의 메서드를 전부 사용할 수 있다
		cc.method03();
		
		Object obj = new Object();
		//Child ccc = (Child)obj; // 부모 클래스를 자식 클래스로 캐스팅 하는 것은 불가능 에러가 뜬다
		
		
	}

}
