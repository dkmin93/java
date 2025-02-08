package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) { //정렬이 추가된 Queue
		
		//값을 자동 정렬해서 저장합니다.
		Queue<Integer> queue = new PriorityQueue<>();
		
		//값 뒤에 추가
		queue.offer(4);
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println(queue.toString());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("====================================================");
		
		//PriorityQueue는 queue에 담길때 객체의 대소비교를 한다
		Queue<User> que = new PriorityQueue<>();
		
		//우선순위 queue가 순서를 확인할 때 compareTo메서드의 존재여부를 확인한다.
		//compareTo 메서드의 정의된 순서에 따라서 우선순위 값을 지정하게 된다.
		//comparable 인터페이스를 상속받아서 compareTo 메서드를 오버라이딩 하면된다.
		
		//문자열의 비교
		//문자열의 값을 비교해서 양수일 경우 내림차순. 음수일 경우 오름차순이다.
		System.out.println("홍길자".compareTo("홍길동")); 
		
		que.offer( new User("홍길동", 10) );
		que.offer( new User("홍길자", 30) );
		que.offer( new User("이순신", 20) );
		que.offer( new User("신사임당", 40) );
		
		System.out.println(que.toString());
		
		System.out.println(que.poll().toString());
		
		
		
		
	}

}
