package quiz05;

public class Calculator {
	
	int result;
	double pi;
	
	void add(int a) {
		System.out.println("입력한 값을 결과값에 누적시킵니다");
		System.out.println(result += a);
	}
	
	void sub(int b) {
		System.out.println("입력한 값을 결과값에서 차감합니다");
		System.out.println(result -= b);
		
	}
	
	double circle(int r) {
		double result;
		System.out.println("입력한 값을 반지름으로 하는 원의 넓이를 구합니다");
		result = (pi * r * r);
		return result;
	}

}
