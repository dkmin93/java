package day06;

public class PenMain {
	
	public static void main(String[] args) {
		
		//pen을 쓰고 싶으면 객체로 생서을 해야한다
		//펜의 속성에 접근 할 때 . 연산자를 쓴다
		
		Pen black = new Pen();
		black.ink = "검정";
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		System.out.println(black.info());
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 2000;
		red.company = "HI-TEC-C";
		
		red.write();
		System.out.println(red.info());
	}

}
