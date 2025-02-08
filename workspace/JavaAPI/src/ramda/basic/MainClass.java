package ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
//		p.greeting(new Say01() {
//			@Override
//			public void talking() { 톨킹의 소괄호가
//				System.out.println("안녕하세요");
//				
//			}
//		});
		
		//람다식
		p.greeting(() -> { //여기에 있는 소괄호로 온다
			System.out.println("안녕하세요");
		});
		
		
//		p.greeting(new Say02() {
//			@Override
//			public void talking(String word) {
//				System.out.println(word);
//				
//			}
//		});
		
		//1. 타입은 생략이 가능하다
		//2. 매개변수가 1개라면 ()도 생략이 가능하다
		//3. 프로그램 코드가 한줄이면 중괄호도 생략 가능하다
		//4. {}를 생략하고 프로그램 코드가 한줄이면 return 키워드가 생략된다
		p.greeting(word -> System.out.println(word));
		
//		p.greeting(new Say03() {
//			@Override
//			public String talking(String word, int i) {
//				return word + i;
//			}
//		});
		
		p.greeting((word, i) -> word + i); //매개변수 2개라 소괄호 생략 불가능
		
		
		
	}

}
