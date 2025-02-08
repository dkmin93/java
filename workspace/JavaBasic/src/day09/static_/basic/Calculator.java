package day09.static_.basic;

public class Calculator {

	/*
	 * 객체별로 결과값, color는 서로 각각 달라야하므로 일반변수여야 한다.
	 * 객체에서 동일한 값을 가지는 변수는 static을 쓰는게 좋다
	 */

	private String color;
	private int result; 
	public static double pi = 3.14;
	
	static {
		//정적 초기화좌 : 클래스가 load 될 때 단 한 번 실행된다
		//여러번 할 필요가 애초에 없기에
		pi = 3.14;
		System.out.println("정적 초기화자 실행됨!");
	}

	/*
	 * 일반 변수를 사용하는 메서드는 일반 메서드로 생성한다
	 */

	//세터
	public void setColor(String color) {
		this.color = color;
	}
	//게터
	public String getColor() {
		return color;
	}

	/*
	 * 일반 멤버변수를 쓰지않고 범용성있게 사용할 메서드는 static으로 선언하는게 좋다
	 */
	public static double circle(int radius) {
		return radius*radius*pi;
	}
}
