package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) { //선입선출 
		
		//자바에서 기본큐는 Linkedlist를 이용해서 사용한다
		//Linkedlist를 Queue인터페이스에 저장하면,큐 처럼 동작한다
		//Linkedlist는 부모클래스로 queue와 list로 가지기에 Queues는 자식클래스인 LinkedList를 활용할 수 있다.
		Queue<Integer> queue = new LinkedList<>();
		
		//값을 추가하기 offer 선입선출이니까 당연히 뒤에서 부터 추가
		queue.offer(5);
		queue.offer(3);
		queue.offer(4);
		queue.offer(6);
		queue.offer(7);
		
		System.out.println(queue.toString());
		System.out.println("큐의 크기:" + queue.size());
		
		//값을 제거하기 poll 선입선출이니까 당연히 앞에서 부터 제거
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		//앞에서 꺼낸값을 확인 peek
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.toString());
	
		System.out.println("========================================");
		
		//큐에 있는 값을 순서대로 꺼내보기
		queue.poll();
		System.out.println(queue.toString()); //4제거
		queue.poll();
		System.out.println(queue.toString()); //6제거
		queue.poll();
		System.out.println(queue.toString()); //7제거

		System.out.println("=================================================");
		
		//큐가 비었는지 확인한 후에 꺼내는 방법
		//큐가 비었으면 true, 값이 존재하면 false
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
		
		
		
	}

}
