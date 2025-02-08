package thread.yield;

public class MainClass {
	
	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		
		Thread thread01 = new Thread(a, "A");
		Thread thread02 = new Thread(b, "B");
		
		thread01.start();
		thread02.start();
		
		try {
			Thread.sleep(3000); //3초 일시정지
			a.worker = false;
			
			Thread.sleep(10000);
			a.worker = true;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}

}
