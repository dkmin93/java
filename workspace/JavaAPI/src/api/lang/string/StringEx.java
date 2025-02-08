package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {

		String str = new String(new char[] {'h', 'e', 'l', 'l', 'o'});

		//문자열 자르기 - 소괄호 안의 인덱스 번호의 문자열 한글자만 자르기
		char a = str.charAt(0);
		System.out.println(a);

		//문자열 길이
		System.out.println("문자열 길이:" + str.length());

		//문자열 찾기 hello
		System.out.println("문자열 찾은 인덱스 위치:" + str.indexOf("l"));
		System.out.println("문자열을 3번 인덱스 부터 찾은 위치:" + str.indexOf("l", 3));
		System.out.println("문자열을 뒤에서 부터 찾은 위치:" + str.lastIndexOf("l"));
		System.out.println("찾는 문자가 없으면:" + str.indexOf("야!")); // 없다면 -1출력

		//문자열 변경
		String b = "안녕하세요! 문자열은 문자의 합 입니다";
		String r2 = b.replace("문자", "word"); // 타겟문자, 바꿀문자 
		System.out.println(r2); // 발견되는 모든 문자를 다 바꾼다.
		System.out.println(b); // 원본 문자열은 그대로이다.

		b = b.replace("문자", "word");
		System.out.println(b);
		b= b.replace(" ", "");
		System.out.println(b);

		//대소문자 변경
		String c = "abcDEF";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());

		//좌우 양쪽 공백만 제거 trim

		String d = " 오늘은 행복한 월요일 입니다아아아아아아아아악 ";
		System.out.println(d);
		System.out.println(d.trim());

		//문자열 자르기 substring

		String e = "자바칩 프라푸치노";

		System.out.println(e.substring(4)); //공백포함 소괄호 안의 인덱스 번호부터 끝까지 추출
		System.out.println(e.substring(0,3)); //0이상 3미만 추출

		//문자열 비교
		System.out.println("홍길동".equals("홍길동"));

		System.out.println("홍길동".compareTo("홍길자")); //음수가 나오면 뒤에 있는 글자가 아스키코드상 사전적으로 뒤에 있는 경우이다
		System.out.println("홍길동".compareTo("홍길동")); //같은 문자열이므로 차가 0
		System.out.println("홍길자".compareTo("홍길동")); //양수가 나오면 앞에 있는 글자가 사전적으로 앞에 있는 경우

		//문자열 자르기 split()
		String f = "010-1234-5678";

		String[] arr = f.split("-"); //해당 문자열만 제거하고 해당 문자열 기준 구분해서 배열로 반환
		System.out.println(Arrays.toString(arr));

		String[] arr2 = f.split(""); //한글자씩 잘라서 문자열 배열로 반환
		System.out.println(Arrays.toString(arr2));

		//문자열 자르기 toCharArray
		char[] arr3 = f.toCharArray(); //한글자씩 잘라서 char 타입 배열로 반환
		System.out.println(Arrays.toString(arr3));

		//문자열 합치기
		String r = String.join("->", "java", "is", "cool");
		System.out.println(r);


	}

}
