package thread.yield;

public class TestA implements Runnable {

	public boolean worker = true;
	
	@Override
	public void run() {
		
		while(true) {
			if(worker) {
				System.out.println("스레드 A가 실행중");
			} else {
				//실행양보 - 다른 스레드에게 실행을 양보한다
				Thread.yield();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
