package day10.abstract_.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 추상클래스는 다형성을 사용할 수 있게 해주는 방법이다
		 * 자식에서 반드시 오버라이딩이 되어 있기 때문에
		 * 
		 * 추상메서드는 자식클래스에서 오버라이딩을 강제화 한다
		 */
		
		Store ss = new SeoulStore(); //좌변을 SeoulStore ss로 하나 지금처럼 하나 같은 내용이 출력된다
		System.out.println(ss.storeName);
		ss.apple();
		ss.grape();
		ss.melon();
		ss.orange();
		ss.mango();
		
		System.out.println("============================================");
		Store bs = new BusanStore();
		System.out.println(bs.storeName);
		bs.apple();
		bs.grape();
		bs.melon();
		bs.orange();
		bs.mango();
		
		
		
	}

}
