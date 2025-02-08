package ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","이순신", "홍길자", "신사임당");
		
		for(String s : list) {
			System.out.println(s); // 프로그램 코드처리
		}
		
		System.out.println("======================================");
		
		//스트림을 알고 있는 경우
		//stream 함수로 시작
//		Stream<String> stream = list.stream();
//		
//		stream.forEach(new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
		
		list.stream().forEach(t -> System.out.println(t));
		//String 타입 생략
		//매개변수가 1개니까 소괄호도 생략
		//코드가 1줄이니까 중괄호도 생략
		
		
	}

}
