package quiz05;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Computer 클래스의 메서드
		 * rect(double, double) - 직사각형의 넓이 를 리턴(두 변의 곱)
		 * rect(double, double, double) - 직육면체의 넓이 를 리턴(세 변의 곱)
		 */
		
		Computer com = new Computer();
		//com.add(500);
		//com.sub(250);
		// System.out.println(com.circle(3));
		 System.out.println(com.rect(3,6,10));
		
	}

}
