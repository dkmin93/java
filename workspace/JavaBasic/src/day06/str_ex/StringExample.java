package day06.str_ex;

public class StringExample {
	
	public static void main(String[] args) {
		
		String str1 = "홍길자";
		String str2 = "홍길자";
		String str3 = new String("홍길자");
		String str4 = new String("홍길동");
		

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		// 같은 클래스 내에서 동일한 문자열을 생성하면 같은 주소값을 가진다
		
		// 하지만 직접 String객체 생성명령을 내렸거나 다른 클래스에서 넘어온 String은 다른 주소값을 가진다
		
		// 그래서 문자열 비교시에는 == 대신에 equals() 메서드를 사용해서 동등한지 따져야 한다.
		
		System.out.println("====================================");
		
		if(str1.equals(str4)) {
			System.out.println("문자열 자체가 같음");
		} else {
			System.out.println("다른 문자열");
		}
		
		
		
		
		
		
	}

}
