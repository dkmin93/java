package day02;

public class DataTypeEx02 {
	public static void main(String[] args) {
		
		//단일문자 저장하는 타입 char
		char c1 = 'A'; // 크기는 2byte
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; // 유니코드 값으로 표현도 된다.
		
		//문자를 통일하기 위해서 유니코드를 만들었다. 크기가 2byte로 확장하고 65536개의 문자를 사용 가능하다.
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("------------------------------------------------------");
		
		//문자열
		String s1 = "내 친구";
		String s2 = " 홍길동은";
		String s3 = " 말썽꾸러기이다. 길동아 정신차려라";
		System.out.println(s1 + s2 + s3); //문자를 +로 붙이면 붙인 결과가 출력된다.
		System.out.println("si의 문자열의 길이:" + s1.length()); //문자열의 길이를 알 수 있는 변수
		
		//문자열과 다른 데이터타입의 +연산이 붙은 경우
		
		System.out.println(100 +200);
		System.out.println("100" +200); //문자열에 다른 타입이 붙은면 결과는 문자가 된다 100200은 문자
		System.out.println(100 + 200 + "300"); // 먼저 앞을 계산하고 300300은 문자
		System.out.println("100" + 200 + 3.14);
		
		System.out.println("A"+ 10);
		System.out.println('A' + 10); //???
		
	}
}
