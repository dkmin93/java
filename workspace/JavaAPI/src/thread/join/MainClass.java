package thread.join;

public class MainClass {
	
	public static void main(String[] args) {
		
		TestA a = new TestA();
		Thread thread = new Thread(a);
		
		thread.start();
		
		try {
			thread.join(); // 이 스레드가 종료될 때까지 다른 스레드를 정지 시키는 기능
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		System.out.println("A스레드의 계산 결과:" + a.sum);
		System.out.println("메인 스레드 종료");
		
		
	}

}
