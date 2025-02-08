package day11.exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 예외 강제 발생시키기 throw
		 * 메서드 생성자 실행 도중에 throw키워드를 사용하면 예외가 생선된다 
		 */
		try {
			System.out.println(calc(10));
			System.out.println(calc(-10)); // 잘못된 값
		} catch (Exception e) {
			//System.out.println("양수 값을 전달해주세요.");
			e.printStackTrace(); //개발시 예외코드 확인
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	
	public static int calc(int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("양수값을 전달해주세요."); //강제 예외 생성
			//throw로 예외를 생성하면 try~catch나 throws 구문으로 예외를 처리해야한다
		}
		
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum +=i;
		}
		return sum;
	}
	
	
	
	
	
	

}
