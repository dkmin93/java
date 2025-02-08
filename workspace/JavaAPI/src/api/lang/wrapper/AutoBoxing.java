package api.lang.wrapper;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		//AutoBoxing - 기본 타입을 class형으로 자동 형변환 해준다. 반대의 경우도 가능!
		//기본타입 - 기본값이 0, 0.0, false, null
		//객체형타입 - 기본값 null
		
		Integer val1 = 1; //정수 1을 인티저 타입에 바로 저장이 가능하다. 스트링과 유사함
		Double val2 = 3.14; //String str = "~~~";
		
		int a = val1; //인티저 타입을 int 타입으로 바로 저장 가능
		double b = val2;
		
		//래퍼 클래스는 유용한 기능들이 static 메서드로 제공된다.
		System.out.println(Integer.MAX_VALUE); //인티저 타입의 최댓값
		System.out.println(Integer.MIN_VALUE);
		
		//문자열을 기본형으로 변환하는 메서드 매우중요
		int result1 = Integer.parseInt("3");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("30");
		
		System.out.println(result1 + result2 +result3);
		
	}

}
