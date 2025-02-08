package day05;

public class MethodEx02 {
	
	public static void main(String[] args) { //반환이 없으면 void
		
		/*
		 * 매개변수
		 * 1. 메서드를 호출할 때 전달할 매개변수
		 * 2. 없을 수도 있고 여러개일 수도 있다
		 */
	
		int result = calSum(5); // (int a)의 a에 5를 입력한다는 뜻 
		System.out.println(result);
		
		int result2 = calSum(10); 
		System.out.println(result2);
		
		int result3 = calSum2(5, 10);
		System.out.println(result3);
	}

	//1에서 a까지의 합
	static int calSum(int a) { //정수값 반환하므로 int 함수로치면 int a는 f(a)
		//a를 여기서 쓸 수 마음껏 있다
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			sum +=i;
		}
		
		return sum;                //반환이 있을경우 입력해야함
	}
	
	// start에서 end까지의 합
	static int calSum2(int start, int end) { //매개변수가 여러개 일 수도 있다
		
		//스타트와 앤드 사이의 합
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum; //합 변수 sum을 리턴하겠다
	}
	
}
