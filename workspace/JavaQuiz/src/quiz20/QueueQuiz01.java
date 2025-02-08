package quiz20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 은행 대기열 시뮬레이터
		 * 
		 * Queue 인터페이스와 LinkedList를 활용하여 대기열을 관리하세요.
		 * 손님 정보는 Customer라는 클래스로 생성하세요
		 * Customer은 name, arrivalTime을 가지고 있습니다.
		 * arrivalTime은 업무처리 소요시간 입니다(1~3랜덤값을 초기값으로)
		 * 
		 * 손님은 60%의 확률로 생성하고 (랜덤.nextInt(100) < 60)
		 * 대기열이 비어있지 않을 때, 50%확률로 손님이 제거 됩니다. (랜덤.nextInt(100) < 50)
		 * !queue.isEmpty() && ran.nextInt(100)<50
		 * 30회 시뮬레이터를 거쳤을 때, 총 소요시간과, 처리하지 못한 손님을 출력해 주세요.
		 * 
  			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			는 프로그램을 1초 정지 시키는 코드입니다
		 * 
		 * 
		 */
		
		Queue<Customer> queue = new LinkedList<>();
		Random ran = new Random();
		int sum = 0; //누적시간
		
		for(int i = 1; i <= 30; i++) {
			if(ran.nextInt(100) < 60) { //손님이 도착했습니다!
				queue.offer(new Customer("customer" + i));
				System.out.println("customer" + i + "손님이 도착했습니다");
			}
			
			System.out.println("현재 대기열:" + queue.toString());
			
			if(!queue.isEmpty() && ran.nextInt(100)<50) {
				Customer c = queue.poll(); //앞에서 부터 손님 제거
				sum += c.getArrivalTime(); //소요시간 누적
				System.out.println(c.getName() + "님의 업무가 처리되었습니다");
			}
		
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("총 소요시간:" + sum +"초");
		
		System.out.println("처리되지 못한 손님");
		for(Customer m :queue) {
			System.out.print(m.getName() + " ");
		}
	}


	
	

}
