package thread.ex01;

public class ThreadTest implements Runnable {

	//1. runable 인터페이스를 상속 받아서 사용하는 방법
	//synchronized - 스레드가 동기화 메서드를 점유할 때, 다른 스레드의 침범을 막는 기능
	int num = 0;

	@Override
	public synchronized void run() {

		for(int i = 1; i<=10; i++) {
			if(Thread.currentThread().getName().equals("A")) {	
			}
			num++;
			System.out.println(Thread.currentThread().getName()+ " num값:" + num);

			//일시정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //밀리초까지 지원 1000은 1초를 의미한다

		}


	}

}
