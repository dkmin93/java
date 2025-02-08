package day10.abstract_.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		SeoulStore ss = new SeoulStore();
		ss.apple();
		ss.grape(); //오버라이드가 되지 않으면 잘못된 메서드 실행이 될 수 있다
		ss.melon();
		ss.orange();
		
	}

	
	
}
