package day06;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone(); // 생성자
		phone.info();
		
		Phone red = new Phone("red");
		red.info();
		
		Phone black = new Phone("black", 30000);
		black.info();
		
		Phone white = new Phone("연아의 햅틱", "white", 50000);
		white.info();
	}

}
