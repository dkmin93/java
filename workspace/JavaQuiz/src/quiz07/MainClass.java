package quiz07;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car c = new Car("아우디", 100);
		System.out.println("차량 모델 : " + c.model);
		System.out.println("속도 : " + c.speed);
		c.run();
	}

}
